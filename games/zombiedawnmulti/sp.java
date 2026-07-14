/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends mp {
    private int field_j;
    private int field_m;
    static boolean field_h;
    private boolean field_o;
    private fm field_f;
    static int field_g;
    private int field_n;
    private int field_k;
    private int field_l;
    private String field_i;

    private final td a(fm param0, String param1, int param2, int param3) {
        if (param3 != 1) {
            ((sp) this).field_j = -34;
        }
        td var6 = new td(param2 - param0.field_C, param2 + param0.field_r, param1.length());
        td var5 = var6;
        ((sp) this).field_e = new td[]{var6};
        return var5;
    }

    final void a(int param0, int param1, boolean param2, String param3, fm param4) {
        if (param3 == null) {
            ((sp) this).field_e = null;
            return;
        }
        if (((sp) this).field_f == param4) {
            if (((sp) this).field_o) {
                if ((((sp) this).field_m ^ -1) == -3) {
                    if (((sp) this).field_i != null) {
                        if (!(!((sp) this).field_i.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((sp) this).field_m = 2;
        ((sp) this).field_o = param2 ? true : false;
        ((sp) this).field_i = param3;
        ((sp) this).field_f = param4;
        td var8 = this.a(param4, param3, param1, 1);
        td var9 = var8;
        var9.field_e[0] = -param4.a(param3) + param0;
        var9.field_e[param3.length()] = param0;
        qd.a(param4, 0, param3, 109, var9);
    }

    final void a(int param0, byte param1, fm param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((sp) this).field_e = null;
            return;
        }
        if (param2 == ((sp) this).field_f) {
            if (((sp) this).field_o) {
                if (-1 == (((sp) this).field_m ^ -1)) {
                    if (((sp) this).field_i != null) {
                        if (!(!((sp) this).field_i.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((sp) this).field_o = true;
        ((sp) this).field_m = 0;
        ((sp) this).field_i = param3;
        int var7 = -125 / ((-24 - param1) / 46);
        ((sp) this).field_f = param2;
        td var8 = this.a(param2, param3, param4, 1);
        td var9 = var8;
        var8.field_e[0] = param0;
        var9.field_e[param3.length()] = param0 - -param2.a(param3);
        qd.a(param2, 0, param3, 116, var9);
    }

    final static void c(int param0) {
        nb.field_a.h(param0 ^ -123);
        if (!(pj.field_I != null)) {
            pj.field_I = new ta(nb.field_a, pm.field_P);
        }
        if (param0 != 0) {
            Object var2 = null;
            sp.a((go) null, -50, (java.awt.Frame) null);
        }
        nb.field_a.b(param0 + 3016, (cf) (Object) pj.field_I);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6, fm param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        td var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        td stackIn_34_0 = null;
        td stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        td stackIn_35_0 = null;
        td stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        td stackIn_36_0 = null;
        td stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        fm stackIn_39_0 = null;
        fm stackIn_40_0 = null;
        fm stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        td stackOut_33_0 = null;
        td stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        td stackOut_35_0 = null;
        td stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        td stackOut_34_0 = null;
        td stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        fm stackOut_38_0 = null;
        fm stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        fm stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param4 <= -16) {
          L0: {
            if (param3 != 0) {
              break L0;
            } else {
              param3 = param7.field_w;
              break L0;
            }
          }
          if (param0 == null) {
            ((sp) this).field_e = null;
            return;
          } else {
            L1: {
              if (param7 != ((sp) this).field_f) {
                break L1;
              } else {
                if (((sp) this).field_o) {
                  break L1;
                } else {
                  if (((sp) this).field_m != param1) {
                    break L1;
                  } else {
                    if (((sp) this).field_j != param5) {
                      break L1;
                    } else {
                      if (((sp) this).field_n != param3) {
                        break L1;
                      } else {
                        if (param2 != ((sp) this).field_l) {
                          break L1;
                        } else {
                          if (param6 != ((sp) this).field_k) {
                            break L1;
                          } else {
                            if (null == ((sp) this).field_i) {
                              break L1;
                            } else {
                              if (((sp) this).field_i.equals((Object) (Object) param0)) {
                                return;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L2: {
              ((sp) this).field_l = param2;
              ((sp) this).field_j = param5;
              ((sp) this).field_k = param6;
              ((sp) this).field_f = param7;
              ((sp) this).field_i = param0;
              ((sp) this).field_n = param3;
              ((sp) this).field_o = false;
              ((sp) this).field_m = param1;
              var16 = new String[param7.b(param0, param6) + 1];
              var17 = var16;
              var10 = Math.max(1, param7.a(param0, new int[1], var17));
              if (((sp) this).field_j != -4) {
                break L2;
              } else {
                if (-2 == var10) {
                  ((sp) this).field_j = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              ((sp) this).field_e = new td[var10];
              if (((sp) this).field_j == 0) {
                var11 = param7.field_C;
                break L3;
              } else {
                if (((sp) this).field_j != 1) {
                  if (2 != ((sp) this).field_j) {
                    L4: {
                      var12 = (-(((sp) this).field_n * var10) + ((sp) this).field_l) / (1 + var10);
                      if (-1 >= (var12 ^ -1)) {
                        break L4;
                      } else {
                        var12 = 0;
                        break L4;
                      }
                    }
                    ((sp) this).field_n = ((sp) this).field_n + var12;
                    var11 = param7.field_C + var12;
                    break L3;
                  } else {
                    var11 = -(((sp) this).field_n * var10) + -param7.field_r + ((sp) this).field_l;
                    break L3;
                  }
                } else {
                  var11 = param7.field_C + (((sp) this).field_l + -(var10 * ((sp) this).field_n) >> -1852565727);
                  break L3;
                }
              }
            }
            var12 = 0;
            L5: while (true) {
              if (var12 >= var10) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = -param7.field_C + var11;
                  stackOut_33_3 = var11 + param7.field_r;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  if (var13 != null) {
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = stackIn_35_2;
                    stackOut_35_3 = stackIn_35_3;
                    stackOut_35_4 = var13.length();
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    stackIn_36_4 = stackOut_35_4;
                    break L6;
                  } else {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = 0;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_36_4 = stackOut_34_4;
                    break L6;
                  }
                }
                L7: {
                  new td(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                  var14 = stackIn_36_0;
                  var14.field_e[0] = 0;
                  if (var13 != null) {
                    L8: {
                      var14.field_e[var13.length()] = param7.a(var13);
                      stackOut_38_0 = (fm) param7;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if ((param1 ^ -1) != -4) {
                        stackOut_40_0 = (fm) (Object) stackIn_40_0;
                        stackOut_40_1 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        break L8;
                      } else {
                        stackOut_39_0 = (fm) (Object) stackIn_39_0;
                        stackOut_39_1 = ((sp) this).a(var13, 0, param7.a(var13), param6);
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        break L8;
                      }
                    }
                    qd.a(stackIn_41_0, stackIn_41_1, var13, 120, var14);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((sp) this).field_e[var12] = var14;
                var11 = var11 + param3;
                var12++;
                continue L5;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(fm param0, String param1, int param2, byte param3, int param4) {
        if (param1 == null) {
            ((sp) this).field_e = null;
            return;
        }
        if (((sp) this).field_f == param0) {
            if (((sp) this).field_o) {
                if (((sp) this).field_m == 1) {
                    if (((sp) this).field_i != null) {
                        if (!(!((sp) this).field_i.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((sp) this).field_m = 1;
        ((sp) this).field_f = param0;
        ((sp) this).field_o = true;
        if (param3 != 65) {
            ((sp) this).field_o = false;
        }
        td var8 = this.a(param0, param1, param2, 1);
        int var7 = param0.a(param1);
        var8.field_e[0] = param4 + -(var7 >> 1001919233);
        var8.field_e[param1.length()] = param4 - -(var7 >> 1668492769);
        qd.a(param0, 0, param1, param3 ^ 61, var8);
    }

    final static void a(go param0, int param1, java.awt.Frame param2) {
        di var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(param2, true);
          L1: while (true) {
            if (0 != var3.field_f) {
              if (1 != var3.field_f) {
                vd.a(false, 100L);
                continue L0;
              } else {
                if (param1 == 1) {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                } else {
                  return;
                }
              }
            } else {
              vd.a(false, 10L);
              continue L1;
            }
          }
        }
    }

    public sp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
    }
}
