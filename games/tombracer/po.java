/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends bja {
    static String field_i;
    private int field_f;
    private boolean field_h;
    static nh field_l;
    private il field_j;
    private String field_k;
    private int field_e;
    private int field_n;
    private int field_g;
    private int field_m;

    final static int a(int param0, int param1, int param2, byte param3, g[] param4) {
        g var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var5 = param4[param1];
        csa.a(param0, 2097152, param1, param4);
        var6 = param2;
        if (param3 == -65) {
          var7 = param2;
          L0: while (true) {
            if (param0 <= var7) {
              csa.a(param0, param3 ^ -2097217, var6, param4);
              return var6;
            } else {
              if (param4[var7].field_e.b((byte) -98) <= var5.field_e.b((byte) -105)) {
                csa.a(var6, 2097152, var7, param4);
                var6++;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return 30;
        }
    }

    final void a(il param0, byte param1, String param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        kha var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        kha stackIn_31_0 = null;
        kha stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        kha stackIn_32_0 = null;
        kha stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        kha stackIn_33_0 = null;
        kha stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_35_0 = 0;
        String stackIn_35_1 = null;
        il stackIn_35_2 = null;
        kha stackIn_35_3 = null;
        int stackIn_36_0 = 0;
        String stackIn_36_1 = null;
        il stackIn_36_2 = null;
        kha stackIn_36_3 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        il stackIn_37_2 = null;
        kha stackIn_37_3 = null;
        int stackIn_37_4 = 0;
        kha stackOut_30_0 = null;
        kha stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        kha stackOut_32_0 = null;
        kha stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        kha stackOut_31_0 = null;
        kha stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_34_0 = 0;
        String stackOut_34_1 = null;
        il stackOut_34_2 = null;
        kha stackOut_34_3 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        il stackOut_36_2 = null;
        kha stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        int stackOut_35_0 = 0;
        String stackOut_35_1 = null;
        il stackOut_35_2 = null;
        kha stackOut_35_3 = null;
        int stackOut_35_4 = 0;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          if (0 != param7) {
            break L0;
          } else {
            param7 = param0.field_m;
            break L0;
          }
        }
        if (param2 != null) {
          L1: {
            if (((po) this).field_j != param0) {
              break L1;
            } else {
              if (((po) this).field_h) {
                break L1;
              } else {
                if (((po) this).field_m != param6) {
                  break L1;
                } else {
                  if (((po) this).field_e != param4) {
                    break L1;
                  } else {
                    if (((po) this).field_g != param7) {
                      break L1;
                    } else {
                      if (((po) this).field_f != param5) {
                        break L1;
                      } else {
                        if (param3 != ((po) this).field_n) {
                          break L1;
                        } else {
                          if (((po) this).field_k == null) {
                            break L1;
                          } else {
                            if (!((po) this).field_k.equals((Object) (Object) param2)) {
                              break L1;
                            } else {
                              return;
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
            ((po) this).field_n = param3;
            ((po) this).field_e = param4;
            ((po) this).field_j = param0;
            ((po) this).field_k = param2;
            ((po) this).field_m = param6;
            ((po) this).field_g = param7;
            ((po) this).field_f = param5;
            ((po) this).field_h = false;
            var17 = new String[param0.a(param2, param3) + 1];
            var18 = var17;
            var10 = Math.max(1, param0.a(param2, new int[1], var18));
            if (3 != ((po) this).field_e) {
              break L2;
            } else {
              if (-2 == (var10 ^ -1)) {
                ((po) this).field_e = 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0 != ((po) this).field_e) {
              if ((((po) this).field_e ^ -1) == -2) {
                var11 = (((po) this).field_f + -(var10 * ((po) this).field_g) >> -864694431) + param0.field_w;
                break L3;
              } else {
                if ((((po) this).field_e ^ -1) == -3) {
                  var11 = ((po) this).field_f + (-param0.field_k + -(((po) this).field_g * var10));
                  break L3;
                } else {
                  L4: {
                    var12 = (((po) this).field_f - var10 * ((po) this).field_g) / (1 + var10);
                    if (var12 < 0) {
                      var12 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var11 = var12 + param0.field_w;
                  ((po) this).field_g = ((po) this).field_g + var12;
                  break L3;
                }
              }
            } else {
              var11 = param0.field_w;
              break L3;
            }
          }
          ((po) this).field_c = new kha[var10];
          var12 = 0;
          L5: while (true) {
            if (var12 >= var10) {
              L6: {
                if (param1 == -49) {
                  break L6;
                } else {
                  var16 = null;
                  ((po) this).a(58, (il) null, 24, (String) null, -110);
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                var13 = var17[var12];
                stackOut_30_0 = null;
                stackOut_30_1 = null;
                stackOut_30_2 = var11 + -param0.field_w;
                stackOut_30_3 = var11 - -param0.field_k;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                if (var13 == null) {
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  break L7;
                } else {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = var13.length();
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_33_4 = stackOut_31_4;
                  break L7;
                }
              }
              L8: {
                new kha(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                var14 = stackIn_33_0;
                var14.field_c[0] = 0;
                if (var13 == null) {
                  break L8;
                } else {
                  L9: {
                    var14.field_c[var13.length()] = param0.b(var13);
                    stackOut_34_0 = param1 ^ -2097201;
                    stackOut_34_1 = (String) var13;
                    stackOut_34_2 = (il) param0;
                    stackOut_34_3 = (kha) var14;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    if ((param6 ^ -1) != -4) {
                      stackOut_36_0 = stackIn_36_0;
                      stackOut_36_1 = (String) (Object) stackIn_36_1;
                      stackOut_36_2 = (il) (Object) stackIn_36_2;
                      stackOut_36_3 = (kha) (Object) stackIn_36_3;
                      stackOut_36_4 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      stackIn_37_4 = stackOut_36_4;
                      break L9;
                    } else {
                      stackOut_35_0 = stackIn_35_0;
                      stackOut_35_1 = (String) (Object) stackIn_35_1;
                      stackOut_35_2 = (il) (Object) stackIn_35_2;
                      stackOut_35_3 = (kha) (Object) stackIn_35_3;
                      stackOut_35_4 = ((po) this).a(0, var13, param3, param0.b(var13));
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_37_4 = stackOut_35_4;
                      break L9;
                    }
                  }
                  jh.a(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4);
                  break L8;
                }
              }
              var11 = var11 + param7;
              ((po) this).field_c[var12] = var14;
              var12++;
              continue L5;
            }
          }
        } else {
          ((po) this).field_c = null;
          return;
        }
    }

    final void a(int param0, il param1, int param2, String param3, int param4) {
        if (param3 == null) {
            ((po) this).field_c = null;
            return;
        }
        if (((po) this).field_j == param1) {
            if (((po) this).field_h) {
                if (-3 == (((po) this).field_m ^ -1)) {
                    if (((po) this).field_k != null) {
                        if (((po) this).field_k.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_m = 2;
        ((po) this).field_k = param3;
        ((po) this).field_h = true;
        ((po) this).field_j = param1;
        kha var8 = this.a(param1, 0, param3, param2);
        kha var9 = var8;
        var9.field_c[param0] = param4 + -param1.b(param3);
        var9.field_c[param3.length()] = param4;
        jh.a(2097152, param3, param1, var9, 0);
    }

    private final kha a(il param0, int param1, String param2, int param3) {
        if (param1 != 0) {
            Object var6 = null;
            ((po) this).a(114, -55, (il) null, (String) null, -39);
        }
        kha var7 = new kha(param3 - param0.field_w, param0.field_k + param3, param2.length());
        kha var5 = var7;
        ((po) this).field_c = new kha[]{var7};
        return var5;
    }

    final void a(int param0, int param1, il param2, String param3, byte param4) {
        int var6 = 38 / ((param4 - 5) / 54);
        if (!(param3 != null)) {
            ((po) this).field_c = null;
            return;
        }
        if (((po) this).field_j == param2) {
            if (((po) this).field_h) {
                if (1 == ((po) this).field_m) {
                    if (((po) this).field_k != null) {
                        if (((po) this).field_k.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_j = param2;
        ((po) this).field_h = true;
        ((po) this).field_m = 1;
        kha var7 = this.a(param2, 0, param3, param0);
        int var8 = param2.b(param3);
        var7.field_c[0] = param1 - (var8 >> -2066817311);
        var7.field_c[param3.length()] = (var8 >> -409961023) + param1;
        jh.a(2097152, param3, param2, var7, 0);
    }

    final void a(int param0, int param1, il param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((po) this).field_c = null;
            return;
        }
        if (param2 == ((po) this).field_j) {
            if (((po) this).field_h) {
                if (0 == ((po) this).field_m) {
                    if (((po) this).field_k != null) {
                        if (!(!((po) this).field_k.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_j = param2;
        ((po) this).field_h = true;
        ((po) this).field_k = param3;
        ((po) this).field_m = 0;
        kha var7 = this.a(param2, 0, param3, param1);
        kha var8 = var7;
        var7.field_c[0] = param4;
        var8.field_c[param3.length()] = param2.b(param3) + param4;
        if (param0 != 16512) {
            return;
        }
        jh.a(param0 ^ 2113664, param3, param2, var8, 0);
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    public po() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Back";
    }
}
