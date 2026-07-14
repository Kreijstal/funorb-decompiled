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
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(mc.a(var2, -1, param0), "_top");
                int var3 = -101 % ((40 - param1) / 46);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, uj param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null != param1.field_p) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (var3_int >= 50) {
                break L1;
              } else {
                if (param1.field_p.peekEvent() == null) {
                  break L1;
                } else {
                  c.a(40, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            if (param0 > 69) {
              try {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    param1.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                    break L2;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              var3 = (Exception) (Object) decompiledCaughtException;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_a = null;
        if (param0 != 102) {
            field_g = null;
        }
        field_f = null;
        field_b = null;
    }

    private hd(int param0, int param1, int param2) {
    }

    final static void a(ka[] param0, int param1, int param2, byte param3, int param4, int param5) {
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
        int var23 = 0;
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
        var23 = TorChallenge.field_F ? 1 : 0;
        if (param0 != null) {
          L0: {
            var6 = -44 / ((0 - param3) / 54);
            if (-1 <= (param2 ^ -1)) {
              break L0;
            } else {
              if (param1 > 0) {
                L1: {
                  if (param0[3] == null) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param0[3].field_q;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var7 = stackIn_9_0;
                  if (param0[5] == null) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = param0[5].field_q;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_12_0;
                  if (param0[1] == null) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param0[1].field_v;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_15_0;
                  if (null == param0[7]) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param0[7].field_v;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_18_0;
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
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  qg.a(hb.field_a);
                  if (var19 <= var20) {
                    break L6;
                  } else {
                    var20 = param4 + param1 * var9 / (var9 - -var10);
                    var19 = param4 + param1 * var9 / (var9 - -var10);
                    break L6;
                  }
                }
                L7: {
                  if (param0[0] == null) {
                    break L7;
                  } else {
                    qg.a(param5, param4, var17, var19);
                    param0[0].g(param5, param4);
                    qg.b(hb.field_a);
                    break L7;
                  }
                }
                L8: {
                  if (param0[2] == null) {
                    break L8;
                  } else {
                    qg.a(var18, param4, var11, var19);
                    param0[2].g(var14, param4);
                    qg.b(hb.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (null != param0[6]) {
                    qg.a(param5, var20, var17, var12);
                    param0[6].g(param5, var16);
                    qg.b(hb.field_a);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0[8] == null) {
                    break L10;
                  } else {
                    qg.a(var18, var20, var11, var12);
                    param0[8].g(var14, var16);
                    qg.b(hb.field_a);
                    break L10;
                  }
                }
                L11: {
                  if (null == param0[1]) {
                    break L11;
                  } else {
                    if (0 == param0[1].field_q) {
                      break L11;
                    } else {
                      qg.a(var17, param4, var18, var19);
                      var21 = var13;
                      L12: while (true) {
                        L13: {
                          if (var14 <= var21) {
                            break L13;
                          } else {
                            param0[1].g(var21, param4);
                            var21 = var21 + param0[1].field_q;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        qg.b(hb.field_a);
                        break L11;
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
                        L16: {
                          if (var14 <= var21) {
                            break L16;
                          } else {
                            param0[7].g(var21, var16);
                            var21 = var21 + param0[7].field_q;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        qg.b(hb.field_a);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (param0[3] == null) {
                    break L17;
                  } else {
                    if (param0[3].field_v == 0) {
                      break L17;
                    } else {
                      qg.a(param5, var19, var17, var20);
                      var21 = var15;
                      L18: while (true) {
                        L19: {
                          if (var21 >= var16) {
                            break L19;
                          } else {
                            param0[3].g(param5, var21);
                            var21 = var21 + param0[3].field_v;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        qg.b(hb.field_a);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (null == param0[5]) {
                    break L20;
                  } else {
                    if (0 == param0[5].field_v) {
                      break L20;
                    } else {
                      qg.a(var18, var19, var11, var20);
                      var21 = var15;
                      L21: while (true) {
                        L22: {
                          if (var21 >= var16) {
                            break L22;
                          } else {
                            param0[5].g(var14, var21);
                            var21 = var21 + param0[5].field_v;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        qg.b(hb.field_a);
                        break L20;
                      }
                    }
                  }
                }
                L23: {
                  if (null == param0[4]) {
                    break L23;
                  } else {
                    if (0 == param0[4].field_q) {
                      break L23;
                    } else {
                      if (0 != param0[4].field_v) {
                        qg.a(var17, var19, var18, var20);
                        var21 = var15;
                        L24: while (true) {
                          L25: {
                            if (var21 >= var16) {
                              break L25;
                            } else {
                              var22 = var13;
                              L26: while (true) {
                                L27: {
                                  if (var14 <= var22) {
                                    break L27;
                                  } else {
                                    param0[4].g(var22, var21);
                                    var22 = var22 + param0[4].field_q;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param0[4].field_v;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          qg.b(hb.field_a);
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1, uf param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (31 != param2.field_m[param2.field_q]) {
                break L0;
              } else {
                if (-117 == param2.field_m[param2.field_q - -1]) {
                  L1: {
                    if (param1 == -117) {
                      break L1;
                    } else {
                      field_f = null;
                      break L1;
                    }
                  }
                  L2: {
                    if (null != ((hd) this).field_e) {
                      break L2;
                    } else {
                      ((hd) this).field_e = new java.util.zip.Inflater(true);
                      break L2;
                    }
                  }
                  try {
                    ((hd) this).field_e.setInput(param2.field_m, param2.field_q - -10, param2.field_m.length + (-8 + -param2.field_q) - 10);
                    int discarded$2 = ((hd) this).field_e.inflate(param0);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((hd) this).field_e.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
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
        int var1 = 73 % ((16 - param0) / 48);
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
        if (param0 != 7) {
            return;
        }
        gi.field_a = new rb(param8);
        wf.field_i = new oa(gb.field_d, gi.field_a);
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
