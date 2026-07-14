/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements Iterable {
    kd field_a;
    static String field_h;
    static String[] field_g;
    static int field_b;
    static pn field_i;
    static boolean field_f;
    static int field_d;
    static wk[] field_j;
    static java.security.SecureRandom field_c;
    static wk field_e;

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) ub.field_e);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ub.field_e);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ub.field_e);
        wn.field_d = param0;
    }

    final kd a(int param0) {
        kd var2 = null;
        L0: {
          if (param0 == 12515) {
            break L0;
          } else {
            field_b = 114;
            break L0;
          }
        }
        var2 = ((hb) this).field_a.field_o;
        if (((hb) this).field_a == var2) {
          return null;
        } else {
          var2.e(480);
          return var2;
        }
    }

    final void a(byte param0, kd param1) {
        if (param0 <= 16) {
            field_i = null;
        }
        if (!(param1.field_v == null)) {
            param1.e(480);
        }
        param1.field_o = ((hb) this).field_a;
        param1.field_v = ((hb) this).field_a.field_v;
        param1.field_v.field_o = param1;
        param1.field_o.field_v = param1;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wh((hb) this);
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
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
        L0: {
          var20 = SteelSentinels.field_G;
          if (param4 < 0) {
            break L0;
          } else {
            if (param7 < lf.field_h) {
              L1: {
                var9 = 54 / ((59 - param1) / 54);
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
                    break L1;
                  } else {
                    if (param0 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param2 < lf.field_g) {
                  break L2;
                } else {
                  if (lf.field_g > param5) {
                    break L2;
                  } else {
                    if (lf.field_g <= param0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var15 = -param7 + param4;
                  if (param6 != param7) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (param4 != param7) {
                          break L6;
                        } else {
                          var10 = param2 << -1203320208;
                          var13 = 0;
                          var11 = param5 << -1956048752;
                          var12 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var16 = -param6 + param4;
                        if (param5 <= param2) {
                          break L7;
                        } else {
                          var11 = param5 << -38451312;
                          var10 = param2 << -1392061104;
                          var12 = (param0 + -param2 << -1303604016) / var15;
                          var13 = (-param5 + param0 << -601132720) / var16;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = (param0 + -param2 << -1520475472) / var15;
                      var12 = (param0 - param5 << -537537584) / var16;
                      var11 = param2 << 1741891920;
                      var10 = param5 << -1519884656;
                      break L5;
                    }
                    var14 = 0;
                    if (param7 < 0) {
                      param7 = Math.min(-param7, param6 - param7);
                      var11 = var11 + var13 * param7;
                      var10 = var10 + var12 * param7;
                      param7 = 0;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L8: {
                  L9: {
                    var11 = param2 << 1267305840;
                    var10 = param2 << 1267305840;
                    var16 = -param7 + param6;
                    var13 = (-param2 + param0 << 696865424) / var15;
                    var12 = (-param2 + param5 << 1517472624) / var16;
                    if (var13 > var12) {
                      break L9;
                    } else {
                      var14 = 1;
                      var17 = var12;
                      var12 = var13;
                      var13 = var17;
                      if (0 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var14 = 0;
                  break L8;
                }
                L10: {
                  L11: {
                    if (param7 < 0) {
                      L12: {
                        if (0 > param6) {
                          break L12;
                        } else {
                          param7 = -param7;
                          var11 = var11 + param7 * var13;
                          var10 = var10 + var12 * param7;
                          param7 = 0;
                          if (0 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      param7 = -param7 + param6;
                      var11 = var11 + var13 * param7;
                      var10 = var10 + param7 * var12;
                      param7 = param6;
                      if (0 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  var17 = lf.field_c[param7];
                  L13: while (true) {
                    if (param6 <= param7) {
                      break L10;
                    } else {
                      L14: {
                        var18 = var10 >> 1231345296;
                        if (var18 >= lf.field_g) {
                          break L14;
                        } else {
                          L15: {
                            var19 = (var11 >> 564464912) - (var10 >> -2072930480);
                            if (var19 != 0) {
                              break L15;
                            } else {
                              if (var18 < 0) {
                                break L14;
                              } else {
                                if (var18 < lf.field_g) {
                                  k.a(true, param3, var19, var17 + var18, param8);
                                  if (0 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          L16: {
                            if (var19 + var18 < lf.field_g) {
                              break L16;
                            } else {
                              var19 = -1 + lf.field_g - var18;
                              break L16;
                            }
                          }
                          L17: {
                            if (0 > var18) {
                              break L17;
                            } else {
                              k.a(true, param3, var19, var18 + var17, param8);
                              if (0 == 0) {
                                break L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                          k.a(true, param3, var18 + var19, var17, param8);
                          break L14;
                        }
                      }
                      param7++;
                      if (lf.field_h > param7) {
                        var17 = var17 + pb.field_c;
                        var11 = var11 + var13;
                        var10 = var10 + var12;
                        if (0 == 0) {
                          continue L13;
                        } else {
                          break L10;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L18: {
                  var17 = param4 - param6;
                  if (var17 != 0) {
                    break L18;
                  } else {
                    var12 = 0;
                    var13 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  L20: {
                    var18 = param0 << 1901343184;
                    if (var14 == 0) {
                      break L20;
                    } else {
                      var11 = param5 << 1121623184;
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  var10 = param5 << 1965706384;
                  break L19;
                }
                var13 = (var18 + -var11) / var17;
                var12 = (-var10 + var18) / var17;
                break L3;
              }
              L21: {
                if (0 <= param7) {
                  break L21;
                } else {
                  param7 = -param7;
                  var10 = var10 + param7 * var12;
                  var11 = var11 + var13 * param7;
                  param7 = 0;
                  break L21;
                }
              }
              var16 = lf.field_c[param7];
              if (param4 > param7) {
                L22: {
                  var17 = var10 >> 1274736176;
                  if (lf.field_g <= var17) {
                    break L22;
                  } else {
                    L23: {
                      var18 = -(var10 >> 2004680432) + (var11 >> -1547207632);
                      if (var18 != 0) {
                        break L23;
                      } else {
                        if (var17 < 0) {
                          break L22;
                        } else {
                          if (var17 < lf.field_g) {
                            k.a(true, param3, var18, var16 + var17, param8);
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    L24: {
                      if (var17 - -var18 >= lf.field_g) {
                        var18 = -var17 + lf.field_g - 1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (var17 < 0) {
                        break L25;
                      } else {
                        k.a(true, param3, var18, var16 + var17, param8);
                        if (0 == 0) {
                          break L22;
                        } else {
                          break L25;
                        }
                      }
                    }
                    k.a(true, param3, var17 + var18, var16, param8);
                    break L22;
                  }
                }
                param7++;
                if (param7 >= lf.field_h) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var16 = var16 + pb.field_c;
                  var11 = var11 + var13;
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            hb.a(true);
        }
        field_g = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_i = null;
    }

    hb() {
        ((hb) this).field_a = new kd();
        ((hb) this).field_a.field_o = ((hb) this).field_a;
        ((hb) this).field_a.field_v = ((hb) this).field_a;
    }

    final static void a(int param0, int param1, int param2) {
        if (pd.field_S != null) {
            // if_icmpgt L17
        } else {
            pd.field_S = new int[param1 * 2];
        }
        if (ok.field_d != null) {
            // if_icmplt L42
        } else {
            ok.field_d = new int[2 * param1];
        }
        if (null != jm.field_r) {
            // if_icmpgt L68
        } else {
            jm.field_r = new int[2 * param1];
        }
        if (null != ne.field_G) {
            // if_icmpge L105
        }
        ne.field_G = new int[param1 * 2];
        if (param0 >= -118) {
            field_j = null;
        }
        if (mb.field_T != null) {
            // if_icmplt L138
        } else {
            mb.field_T = new int[2 * param1];
        }
        if (null != eb.field_u) {
            // if_icmple L175
        }
        eb.field_u = new int[2 * param1];
        if (un.field_j != null) {
            // if_icmple L207
        }
        un.field_j = new int[(param2 + param1) * 2];
        if (null != vd.field_g) {
            // if_icmpge L236
        }
        vd.field_g = new boolean[param1 * 2];
        k.field_Lb = -2147483648;
        nj.field_S = 2147483647;
        kc.field_z = 0;
        ti.field_w = 2147483647;
        mj.field_cc = -2147483648;
    }

    final static void a(byte param0, wk[] param1, int param2, int param3, int param4, int param5) {
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
        var23 = SteelSentinels.field_G;
        if (param1 != null) {
          L0: {
            if ((param2 ^ -1) >= -1) {
              break L0;
            } else {
              if (param5 <= 0) {
                break L0;
              } else {
                L1: {
                  if (null == param1[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param1[3].field_z;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param1[5] != null) {
                    stackOut_11_0 = param1[5].field_z;
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
                  if (param1[1] != null) {
                    stackOut_14_0 = param1[1].field_B;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (param1[7] == null) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param1[7].field_B;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var11 = -128 % ((param0 - -4) / 41);
                  var10 = param2 + param4;
                  var12 = param3 + param5;
                  var13 = param4 - -var6;
                  var14 = var10 - var7;
                  var15 = var8 + param3;
                  var16 = -var9 + var12;
                  var17 = var13;
                  var18 = var14;
                  if (var18 < var17) {
                    var18 = param4 + param2 * var6 / (var6 + var7);
                    var17 = param4 + param2 * var6 / (var6 + var7);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  pb.b(me.field_g);
                  if (var19 > var20) {
                    var20 = var8 * param5 / (var8 + var9) + param3;
                    var19 = var8 * param5 / (var8 + var9) + param3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1[0] != null) {
                    pb.h(param4, param3, var17, var19);
                    param1[0].a(param4, param3);
                    pb.a(me.field_g);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1[2] == null) {
                    break L8;
                  } else {
                    pb.h(var18, param3, var10, var19);
                    param1[2].a(var14, param3);
                    pb.a(me.field_g);
                    break L8;
                  }
                }
                L9: {
                  if (param1[6] != null) {
                    pb.h(param4, var20, var17, var12);
                    param1[6].a(param4, var16);
                    pb.a(me.field_g);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param1[8] != null) {
                    pb.h(var18, var20, var10, var12);
                    param1[8].a(var14, var16);
                    pb.a(me.field_g);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1[1] == null) {
                    break L11;
                  } else {
                    if (0 == param1[1].field_z) {
                      break L11;
                    } else {
                      pb.h(var17, param3, var18, var19);
                      var21 = var13;
                      L12: while (true) {
                        L13: {
                          if (var21 >= var14) {
                            break L13;
                          } else {
                            param1[1].a(var21, param3);
                            var21 = var21 + param1[1].field_z;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        pb.a(me.field_g);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param1[7]) {
                    break L14;
                  } else {
                    if (param1[7].field_z != 0) {
                      pb.h(var17, var20, var18, var12);
                      var21 = var13;
                      L15: while (true) {
                        L16: {
                          if (var21 >= var14) {
                            break L16;
                          } else {
                            param1[7].a(var21, var16);
                            var21 = var21 + param1[7].field_z;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        pb.a(me.field_g);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (param1[3] == null) {
                    break L17;
                  } else {
                    if (0 != param1[3].field_B) {
                      pb.h(param4, var19, var17, var20);
                      var21 = var15;
                      L18: while (true) {
                        L19: {
                          if (var16 <= var21) {
                            break L19;
                          } else {
                            param1[3].a(param4, var21);
                            var21 = var21 + param1[3].field_B;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        pb.a(me.field_g);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (null == param1[5]) {
                    break L20;
                  } else {
                    if (0 == param1[5].field_B) {
                      break L20;
                    } else {
                      pb.h(var18, var19, var10, var20);
                      var21 = var15;
                      L21: while (true) {
                        L22: {
                          if (var16 <= var21) {
                            break L22;
                          } else {
                            param1[5].a(var14, var21);
                            var21 = var21 + param1[5].field_B;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        pb.a(me.field_g);
                        break L20;
                      }
                    }
                  }
                }
                L23: {
                  if (null == param1[4]) {
                    break L23;
                  } else {
                    if (param1[4].field_z == 0) {
                      break L23;
                    } else {
                      if (param1[4].field_B != 0) {
                        pb.h(var17, var19, var18, var20);
                        var21 = var15;
                        L24: while (true) {
                          L25: {
                            if (var16 <= var21) {
                              break L25;
                            } else {
                              var22 = var13;
                              L26: while (true) {
                                L27: {
                                  if (var14 <= var22) {
                                    break L27;
                                  } else {
                                    param1[4].a(var22, var21);
                                    var22 = var22 + param1[4].field_z;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param1[4].field_B;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          pb.a(me.field_g);
                          break L23;
                        }
                      } else {
                        break L23;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_d = -1;
        field_h = "Rankings";
        field_g = new String[]{"Hold <img=26> and drag to move the camera.<br>'A','S','D' control walking.<br>'W' jump.", "'W','A','S','D' move the camera.<br>'Z','X','C' control walking.<br><img=26> or  'SHIFT'+<img=25> jump."};
    }
}
