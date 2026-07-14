/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static int field_a;

    final static void a(kk param0, byte param1) {
        qj var2 = new qj(param0.a("final_frame.jpg", -1, ""), (java.awt.Component) (Object) ki.field_f);
        int var3 = var2.field_t;
        int var4 = var2.field_q;
        nk.b(false);
        ej.field_d = new qj(var3, var4 * 3 / 4);
        ej.field_d.a();
        var2.h(0, 0);
        jd.field_g = new qj(var3, var4 + -ej.field_d.field_q);
        jd.field_g.a();
        var2.h(0, -ej.field_d.field_q);
        jd.field_g.field_o = ej.field_d.field_q;
        if (param1 >= -64) {
            field_a = -73;
        }
        ch.m(26);
    }

    final static void a(qj[] param0, int param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var22 = TrackController.field_F ? 1 : 0;
        if (param0 == null) {
          return;
        } else {
          L0: {
            if (param4 <= 0) {
              break L0;
            } else {
              if ((param2 ^ -1) >= -1) {
                break L0;
              } else {
                L1: {
                  if (param0[3] != null) {
                    stackOut_9_0 = param0[3].field_s;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (param0[5] != null) {
                    stackOut_12_0 = param0[5].field_s;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_13_0;
                  if (param0[1] != null) {
                    stackOut_15_0 = param0[1].field_v;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_16_0;
                  if (null != param0[7]) {
                    stackOut_18_0 = param0[7].field_v;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_19_0;
                  var10 = param1 - -param4;
                  var11 = param2 + param3;
                  var12 = param1 + var6;
                  var13 = -var7 + var10;
                  var14 = var8 + param3;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 < var16) {
                    var17 = param1 - -(param4 * var6 / (var6 + var7));
                    var16 = param1 - -(param4 * var6 / (var6 + var7));
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  ll.a(bf.field_a);
                  if (var19 < var18) {
                    var19 = var8 * param2 / (var8 + var9) + param3;
                    var18 = var8 * param2 / (var8 + var9) + param3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param0[0] == null) {
                    break L7;
                  } else {
                    ll.b(param1, param3, var16, var18);
                    param0[0].e(param1, param3);
                    ll.b(bf.field_a);
                    break L7;
                  }
                }
                L8: {
                  if (param0[2] == null) {
                    break L8;
                  } else {
                    ll.b(var17, param3, var10, var18);
                    param0[2].e(var13, param3);
                    ll.b(bf.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (param0[6] != null) {
                    ll.b(param1, var19, var16, var11);
                    param0[6].e(param1, var15);
                    ll.b(bf.field_a);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0[8] != null) {
                    ll.b(var17, var19, var10, var11);
                    param0[8].e(var13, var15);
                    ll.b(bf.field_a);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0[1] == null) {
                    break L11;
                  } else {
                    if (param0[1].field_s != 0) {
                      ll.b(var16, param3, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param0[1].e(var20, param3);
                            var20 = var20 + param0[1].field_s;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        ll.b(bf.field_a);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L14: {
                  if (null == param0[7]) {
                    break L14;
                  } else {
                    if (-1 != (param0[7].field_s ^ -1)) {
                      ll.b(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var20 >= var13) {
                            break L16;
                          } else {
                            param0[7].e(var20, var15);
                            var20 = var20 + param0[7].field_s;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ll.b(bf.field_a);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (null == param0[3]) {
                    break L17;
                  } else {
                    if (-1 == (param0[3].field_v ^ -1)) {
                      break L17;
                    } else {
                      ll.b(param1, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var15 <= var20) {
                            break L19;
                          } else {
                            param0[3].e(param1, var20);
                            var20 = var20 + param0[3].field_v;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ll.b(bf.field_a);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (null == param0[5]) {
                    break L20;
                  } else {
                    if (param0[5].field_v != 0) {
                      ll.b(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var20 >= var15) {
                            break L22;
                          } else {
                            param0[5].e(var13, var20);
                            var20 = var20 + param0[5].field_v;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        ll.b(bf.field_a);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (param0[param5] == null) {
                    break L23;
                  } else {
                    if (0 == param0[4].field_s) {
                      break L23;
                    } else {
                      if (0 != param0[4].field_v) {
                        ll.b(var16, var18, var17, var19);
                        var20 = var14;
                        L24: while (true) {
                          L25: {
                            if (var15 <= var20) {
                              break L25;
                            } else {
                              var21 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var21 >= var13) {
                                    break L27;
                                  } else {
                                    param0[4].e(var21, var20);
                                    var21 = var21 + param0[4].field_s;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param0[4].field_v;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          ll.b(bf.field_a);
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
        }
    }

    final static void a(int param0, int param1) {
        int var3 = TrackController.field_F ? 1 : 0;
        if (param0 != 7) {
            Object var4 = null;
            cl.a((qj[]) null, -82, 53, -34, 34, -30);
        }
        jf var5 = (jf) (Object) ei.field_m.b(param0 + -5);
        while (var5 != null) {
            rd.a(var5, param0 + -3, param1);
            var5 = (jf) (Object) ei.field_m.a(10);
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        int var4 = -1;
        for (var5 = param2; param1 > var5; var5++) {
            var4 = lj.field_e[(param3[var5] ^ var4) & 255] ^ var4 >>> -1232666776;
        }
        if (param0 != 1) {
            Object var7 = null;
            cl.a((qj[]) null, 92, 80, -112, -104, -128);
        }
        var4 = var4 ^ -1;
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 250;
    }
}
