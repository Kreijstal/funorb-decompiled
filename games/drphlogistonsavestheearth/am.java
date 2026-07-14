/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends ic {
    static int field_p;
    static od field_n;
    private ug field_s;
    vd field_q;
    static int field_l;
    ec field_r;
    static String field_m;
    static nh field_o;

    final int d() {
        return 0;
    }

    final ic c() {
        cc var1 = null;
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        L0: while (true) {
          var1 = (cc) (Object) ((am) this).field_q.e(0);
          if (var1 != null) {
            if (var1.field_D != null) {
              return (ic) (Object) var1.field_D;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final ic a() {
        cc var1 = null;
        var1 = (cc) (Object) ((am) this).field_q.h(-11151);
        if (var1 != null) {
          if (var1.field_D != null) {
            return (ic) (Object) var1.field_D;
          } else {
            return ((am) this).c();
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, nh[] param3, int param4, int param5) {
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param3 == null) {
          return;
        } else {
          if (0 < param2) {
            if (0 >= param1) {
              return;
            } else {
              L0: {
                if (null == param3[3]) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_9_0 = param3[3].field_z;
                  stackIn_11_0 = stackOut_9_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_11_0;
                if (null == param3[5]) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = param3[5].field_z;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_14_0;
                if (param4 == 14673) {
                  break L2;
                } else {
                  field_n = null;
                  break L2;
                }
              }
              L3: {
                if (param3[1] == null) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                } else {
                  stackOut_17_0 = param3[1].field_C;
                  stackIn_19_0 = stackOut_17_0;
                  break L3;
                }
              }
              L4: {
                var8 = stackIn_19_0;
                if (null == param3[7]) {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L4;
                } else {
                  stackOut_20_0 = param3[7].field_C;
                  stackIn_22_0 = stackOut_20_0;
                  break L4;
                }
              }
              L5: {
                var9 = stackIn_22_0;
                var10 = param2 + param5;
                var11 = param0 - -param1;
                var12 = var6 + param5;
                var13 = var10 + -var7;
                var14 = param0 - -var8;
                var15 = var11 + -var9;
                var16 = var12;
                var17 = var13;
                if (var16 > var17) {
                  var17 = param2 * var6 / (var7 + var6) + param5;
                  var16 = param2 * var6 / (var7 + var6) + param5;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var18 = var14;
                var19 = var15;
                wj.b(tg.field_i);
                if (var18 <= var19) {
                  break L6;
                } else {
                  var19 = var8 * param1 / (var8 - -var9) + param0;
                  var18 = var8 * param1 / (var8 - -var9) + param0;
                  break L6;
                }
              }
              L7: {
                if (param3[0] != null) {
                  wj.d(param5, param0, var16, var18);
                  param3[0].d(param5, param0);
                  wj.a(tg.field_i);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param3[2] == null) {
                  break L8;
                } else {
                  wj.d(var17, param0, var10, var18);
                  param3[2].d(var13, param0);
                  wj.a(tg.field_i);
                  break L8;
                }
              }
              L9: {
                if (null != param3[6]) {
                  wj.d(param5, var19, var16, var11);
                  param3[6].d(param5, var15);
                  wj.a(tg.field_i);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (null == param3[8]) {
                  break L10;
                } else {
                  wj.d(var17, var19, var10, var11);
                  param3[8].d(var13, var15);
                  wj.a(tg.field_i);
                  break L10;
                }
              }
              L11: {
                if (param3[1] == null) {
                  break L11;
                } else {
                  if (0 != param3[1].field_z) {
                    wj.d(var16, param0, var17, var18);
                    var20 = var12;
                    L12: while (true) {
                      L13: {
                        if (var20 >= var13) {
                          break L13;
                        } else {
                          param3[1].d(var20, param0);
                          var20 = var20 + param3[1].field_z;
                          if (0 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      wj.a(tg.field_i);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              L14: {
                if (param3[7] == null) {
                  break L14;
                } else {
                  if (param3[7].field_z != 0) {
                    wj.d(var16, var19, var17, var11);
                    var20 = var12;
                    L15: while (true) {
                      L16: {
                        if (var13 <= var20) {
                          break L16;
                        } else {
                          param3[7].d(var20, var15);
                          var20 = var20 + param3[7].field_z;
                          if (0 == 0) {
                            continue L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      wj.a(tg.field_i);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
              }
              L17: {
                if (null == param3[3]) {
                  break L17;
                } else {
                  if (param3[3].field_C == 0) {
                    break L17;
                  } else {
                    wj.d(param5, var18, var16, var19);
                    var20 = var14;
                    L18: while (true) {
                      L19: {
                        if (var20 >= var15) {
                          break L19;
                        } else {
                          param3[3].d(param5, var20);
                          var20 = var20 + param3[3].field_C;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      wj.a(tg.field_i);
                      break L17;
                    }
                  }
                }
              }
              L20: {
                if (null == param3[5]) {
                  break L20;
                } else {
                  if (param3[5].field_C != 0) {
                    wj.d(var17, var18, var10, var19);
                    var20 = var14;
                    L21: while (true) {
                      L22: {
                        if (var15 <= var20) {
                          break L22;
                        } else {
                          param3[5].d(var13, var20);
                          var20 = var20 + param3[5].field_C;
                          if (0 == 0) {
                            continue L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      wj.a(tg.field_i);
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
              }
              L23: {
                if (null == param3[4]) {
                  break L23;
                } else {
                  if (-1 == (param3[4].field_z ^ -1)) {
                    break L23;
                  } else {
                    if (param3[4].field_C == 0) {
                      break L23;
                    } else {
                      wj.d(var16, var18, var17, var19);
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
                                  param3[4].d(var21, var20);
                                  var21 = var21 + param3[4].field_z;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              var20 = var20 + param3[4].field_C;
                              if (0 == 0) {
                                continue L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        wj.a(tg.field_i);
                        break L23;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static String h(int param0) {
        if (!(null != oa.field_d)) {
            return "";
        }
        if (param0 != 0) {
            return null;
        }
        return oa.field_d;
    }

    final static void g(int param0) {
        oa.field_d = dh.field_N.b((byte) -53);
        CharSequence var2 = (CharSequence) (Object) oa.field_d;
        tf.field_pb = rh.a(119, var2);
        if (param0 != 11) {
            am.g(-127);
        }
    }

    private final void a(int param0, int param1, cc param2, byte param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ag var11 = null;
        int var12 = 0;
        ug stackIn_11_0 = null;
        cc stackIn_11_1 = null;
        ug stackIn_12_0 = null;
        cc stackIn_12_1 = null;
        ug stackIn_13_0 = null;
        cc stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        ug stackOut_10_0 = null;
        cc stackOut_10_1 = null;
        ug stackOut_12_0 = null;
        cc stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        ug stackOut_11_0 = null;
        cc stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        L0: {
          var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param3 == 97) {
            break L0;
          } else {
            field_l = -91;
            break L0;
          }
        }
        L1: {
          if (-1 == (4 & ((am) this).field_s.field_C[param2.field_u] ^ -1)) {
            break L1;
          } else {
            if ((param2.field_k ^ -1) <= -1) {
              break L1;
            } else {
              var7 = ((am) this).field_s.field_B[param2.field_u] / id.field_d;
              L2: while (true) {
                var8 = (-param2.field_i + 1048575 - -var7) / var7;
                if (param1 >= var8) {
                  L3: {
                    param2.field_D.b(param4, param0, var8);
                    param0 = param0 + var8;
                    param2.field_i = param2.field_i + (var8 * var7 - 1048576);
                    param1 = param1 - var8;
                    var9 = id.field_d / 100;
                    var10 = 262144 / var7;
                    if (var9 <= var10) {
                      break L3;
                    } else {
                      var9 = var10;
                      break L3;
                    }
                  }
                  L4: {
                    var11 = param2.field_D;
                    if (((am) this).field_s.field_E[param2.field_u] == 0) {
                      param2.field_D = ag.b(param2.field_C, var11.j(), var11.e(), var11.h());
                      break L4;
                    } else {
                      L5: {
                        param2.field_D = ag.b(param2.field_C, var11.j(), 0, var11.h());
                        stackOut_10_0 = ((am) this).field_s;
                        stackOut_10_1 = (cc) param2;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if ((param2.field_o.field_p[param2.field_F] ^ -1) <= -1) {
                          stackOut_12_0 = (ug) (Object) stackIn_12_0;
                          stackOut_12_1 = (cc) (Object) stackIn_12_1;
                          stackOut_12_2 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L5;
                        } else {
                          stackOut_11_0 = (ug) (Object) stackIn_11_0;
                          stackOut_11_1 = (cc) (Object) stackIn_11_1;
                          stackOut_11_2 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L5;
                        }
                      }
                      ((ug) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, (byte) -88);
                      param2.field_D.e(var9, var11.e());
                      break L4;
                    }
                  }
                  L6: {
                    if (-1 >= (param2.field_o.field_p[param2.field_F] ^ -1)) {
                      break L6;
                    } else {
                      param2.field_D.f(-1);
                      break L6;
                    }
                  }
                  var11.k(var9);
                  var11.b(param4, param0, param5 - param0);
                  if (var11.g()) {
                    ((am) this).field_r.a((ic) (Object) var11);
                    continue L2;
                  } else {
                    continue L2;
                  }
                } else {
                  param2.field_i = param2.field_i + param1 * var7;
                  break L1;
                }
              }
            }
          }
        }
        param2.field_D.b(param4, param0, param1);
    }

    private final void a(int param0, cc param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ug stackIn_8_0 = null;
        cc stackIn_8_1 = null;
        ug stackIn_9_0 = null;
        cc stackIn_9_1 = null;
        ug stackIn_10_0 = null;
        cc stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        ug stackOut_7_0 = null;
        cc stackOut_7_1 = null;
        ug stackOut_9_0 = null;
        cc stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        ug stackOut_8_0 = null;
        cc stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        L0: {
          if ((((am) this).field_s.field_C[param1.field_u] & 4) == 0) {
            break L0;
          } else {
            if (0 > param1.field_k) {
              var4 = ((am) this).field_s.field_B[param1.field_u] / id.field_d;
              var5 = (var4 + (1048575 + -param1.field_i)) / var4;
              param1.field_i = param2 * var4 + param1.field_i & 1048575;
              if (var5 <= param2) {
                L1: {
                  if (((am) this).field_s.field_E[param1.field_u] != 0) {
                    L2: {
                      param1.field_D = ag.b(param1.field_C, param1.field_D.j(), 0, param1.field_D.h());
                      stackOut_7_0 = ((am) this).field_s;
                      stackOut_7_1 = (cc) param1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (0 <= param1.field_o.field_p[param1.field_F]) {
                        stackOut_9_0 = (ug) (Object) stackIn_9_0;
                        stackOut_9_1 = (cc) (Object) stackIn_9_1;
                        stackOut_9_2 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L2;
                      } else {
                        stackOut_8_0 = (ug) (Object) stackIn_8_0;
                        stackOut_8_1 = (cc) (Object) stackIn_8_1;
                        stackOut_8_2 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L2;
                      }
                    }
                    ((ug) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0, (byte) -102);
                    break L1;
                  } else {
                    param1.field_D = ag.b(param1.field_C, param1.field_D.j(), param1.field_D.e(), param1.field_D.h());
                    break L1;
                  }
                }
                L3: {
                  if (0 > param1.field_o.field_p[param1.field_F]) {
                    param1.field_D.f(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param2 = param1.field_i / var4;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        if (param0 >= -24) {
          return;
        } else {
          param1.field_D.d(param2);
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        cc var6 = null;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((am) this).field_r.b(param0, param1, param2);
        var6 = (cc) (Object) ((am) this).field_q.h(-11151);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (((am) this).field_s.a(-128, var6)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_l >= var5) {
                    this.a(var4, var5, var6, (byte) 97, param0, var5 + var4);
                    var6.field_l = var6.field_l - var5;
                    break L1;
                  } else {
                    this.a(var4, var6.field_l, var6, (byte) 97, param0, var4 - -var5);
                    var5 = var5 - var6.field_l;
                    var4 = var4 + var6.field_l;
                    if (!((am) this).field_s.a(var4, param0, -128, var6, var5)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var6 = (cc) (Object) ((am) this).field_q.e(0);
            continue L0;
          }
        }
    }

    public static void f(int param0) {
        field_o = null;
        field_m = null;
        if (param0 >= -108) {
            return;
        }
        field_n = null;
    }

    final void d(int param0) {
        int var2 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((am) this).field_r.d(param0);
        cc var3 = (cc) (Object) ((am) this).field_q.h(-11151);
        while (var3 != null) {
            if (!(((am) this).field_s.a(-124, var3))) {
                var2 = param0;
                while (var3.field_l < var2) {
                    this.a(-127, var3, var3.field_l);
                    var2 = var2 - var3.field_l;
                    // ifne L124
                }
                this.a(-59, var3, var2);
                var3.field_l = var3.field_l - var2;
            }
            var3 = (cc) (Object) ((am) this).field_q.e(0);
        }
    }

    final static void e(int param0) {
        if (param0 != 11) {
            am.g(115);
        }
        if (-11 != (af.field_b ^ -1)) {
            // ifne L46
        }
        re.a(true);
        af.field_b = 11;
        kl.field_S = true;
    }

    am(ug param0) {
        ((am) this).field_q = new vd();
        ((am) this).field_r = new ec();
        ((am) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 75;
        field_p = field_l / 2;
        field_n = new od(256);
    }
}
