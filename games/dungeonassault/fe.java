/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends l {
    private boolean field_q;
    private String field_l;
    private int field_j;
    static md field_k;
    private int field_m;
    private int field_p;
    private int field_h;
    private se field_i;
    static int[] field_g;
    static String[] field_n;
    private int field_o;

    final void a(int param0, byte param1, String param2, se param3, int param4) {
        if (!(param2 != null)) {
            ((fe) this).field_e = null;
            return;
        }
        int var6 = -118 / ((29 - param1) / 50);
        if (param3 == ((fe) this).field_i) {
            if (((fe) this).field_q) {
                if (2 == ((fe) this).field_h) {
                    if (((fe) this).field_l != null) {
                        if (!(!((fe) this).field_l.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((fe) this).field_l = param2;
        ((fe) this).field_q = true;
        ((fe) this).field_i = param3;
        ((fe) this).field_h = 2;
        tg var7 = this.a(param2, param4, param3, 0);
        var7.field_k[0] = param0 + -param3.b(param2);
        var7.field_k[param2.length()] = param0;
        bf.a(param2, var7, 0, param3, 15553);
    }

    final void a(String param0, int param1, se param2, int param3, int param4) {
        if (param0 == null) {
            ((fe) this).field_e = null;
            return;
        }
        if (param2 == ((fe) this).field_i) {
            if (((fe) this).field_q) {
                if (-1 == (((fe) this).field_h ^ -1)) {
                    if (((fe) this).field_l != null) {
                        if (!(!((fe) this).field_l.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        ((fe) this).field_h = 0;
        ((fe) this).field_i = param2;
        ((fe) this).field_q = true;
        ((fe) this).field_l = param0;
        if (param1 > -17) {
            return;
        }
        tg var7 = this.a(param0, param4, param2, 0);
        tg var8 = var7;
        var7.field_k[0] = param3;
        var8.field_k[param0.length()] = param3 + param2.b(param0);
        bf.a(param0, var8, 0, param2, 15553);
    }

    public static void b(byte param0) {
        if (param0 > -33) {
            fe.b((byte) -23);
        }
        field_n = null;
        field_g = null;
        field_k = null;
    }

    private final tg a(String param0, int param1, se param2, int param3) {
        if (param3 != 0) {
            return null;
        }
        tg var6 = new tg(param1 + -param2.field_H, param2.field_E + param1, param0.length());
        tg var5 = var6;
        ((fe) this).field_e = new tg[]{var6};
        return var5;
    }

    final void a(int param0, String param1, se param2, byte param3, int param4) {
        if (!(param1 != null)) {
            ((fe) this).field_e = null;
            return;
        }
        if (param2 == ((fe) this).field_i) {
            if (((fe) this).field_q) {
                if (-2 == (((fe) this).field_h ^ -1)) {
                    if (null != ((fe) this).field_l) {
                        if (((fe) this).field_l.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((fe) this).field_h = 1;
        ((fe) this).field_q = true;
        ((fe) this).field_i = param2;
        int var8 = -121 % ((34 - param3) / 47);
        tg var9 = this.a(param1, param0, param2, 0);
        int var7 = param2.b(param1);
        var9.field_k[0] = param4 + -(var7 >> -1014860703);
        var9.field_k[param1.length()] = param4 - -(var7 >> 2067545665);
        bf.a(param1, var9, 0, param2, 15553);
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, se param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        tg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        tg stackIn_31_0 = null;
        tg stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        tg stackIn_32_0 = null;
        tg stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        tg stackIn_33_0 = null;
        tg stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        String stackIn_36_0 = null;
        tg stackIn_36_1 = null;
        String stackIn_37_0 = null;
        tg stackIn_37_1 = null;
        String stackIn_38_0 = null;
        tg stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        tg stackOut_30_0 = null;
        tg stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        tg stackOut_32_0 = null;
        tg stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        tg stackOut_31_0 = null;
        tg stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        String stackOut_35_0 = null;
        tg stackOut_35_1 = null;
        String stackOut_37_0 = null;
        tg stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        String stackOut_36_0 = null;
        tg stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        L0: {
          var15 = DungeonAssault.field_K;
          if (0 != param6) {
            break L0;
          } else {
            param6 = param7.field_R;
            break L0;
          }
        }
        if (param0 == null) {
          ((fe) this).field_e = null;
          return;
        } else {
          L1: {
            if (param7 != ((fe) this).field_i) {
              break L1;
            } else {
              if (((fe) this).field_q) {
                break L1;
              } else {
                if (param4 != ((fe) this).field_h) {
                  break L1;
                } else {
                  if (((fe) this).field_p != param2) {
                    break L1;
                  } else {
                    if (((fe) this).field_o != param6) {
                      break L1;
                    } else {
                      if (param3 != ((fe) this).field_m) {
                        break L1;
                      } else {
                        if (((fe) this).field_j != param5) {
                          break L1;
                        } else {
                          if (null == ((fe) this).field_l) {
                            break L1;
                          } else {
                            if (!((fe) this).field_l.equals((Object) (Object) param0)) {
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
            ((fe) this).field_p = param2;
            ((fe) this).field_h = param4;
            ((fe) this).field_q = false;
            ((fe) this).field_m = param3;
            ((fe) this).field_j = param5;
            ((fe) this).field_o = param6;
            ((fe) this).field_l = param0;
            ((fe) this).field_i = param7;
            var16 = new String[param7.c(param0, param5) - -1];
            var17 = var16;
            var10 = Math.max(1, param7.a(param0, new int[1], var17));
            if (((fe) this).field_p != 3) {
              break L2;
            } else {
              if (-2 != var10) {
                break L2;
              } else {
                ((fe) this).field_p = 1;
                break L2;
              }
            }
          }
          L3: {
            if (((fe) this).field_p == param1) {
              var11 = param7.field_H;
              break L3;
            } else {
              if (-2 == ((fe) this).field_p) {
                var11 = (-(((fe) this).field_o * var10) + ((fe) this).field_m >> 494689441) + param7.field_H;
                break L3;
              } else {
                if (-3 != (((fe) this).field_p ^ -1)) {
                  L4: {
                    var12 = (((fe) this).field_m - ((fe) this).field_o * var10) / (var10 - -1);
                    if (-1 < (var12 ^ -1)) {
                      var12 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((fe) this).field_o = ((fe) this).field_o + var12;
                  var11 = param7.field_H + var12;
                  break L3;
                } else {
                  var11 = -param7.field_E + ((fe) this).field_m - var10 * ((fe) this).field_o;
                  break L3;
                }
              }
            }
          }
          ((fe) this).field_e = new tg[var10];
          var12 = 0;
          L5: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L6: {
                var13 = var16[var12];
                stackOut_30_0 = null;
                stackOut_30_1 = null;
                stackOut_30_2 = -param7.field_H + var11;
                stackOut_30_3 = var11 - -param7.field_E;
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
                  break L6;
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
                  break L6;
                }
              }
              L7: {
                new tg(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                var14 = stackIn_33_0;
                var14.field_k[0] = 0;
                if (var13 != null) {
                  L8: {
                    var14.field_k[var13.length()] = param7.b(var13);
                    stackOut_35_0 = (String) var13;
                    stackOut_35_1 = (tg) var14;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    if (3 != param4) {
                      stackOut_37_0 = (String) (Object) stackIn_37_0;
                      stackOut_37_1 = (tg) (Object) stackIn_37_1;
                      stackOut_37_2 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      break L8;
                    } else {
                      stackOut_36_0 = (String) (Object) stackIn_36_0;
                      stackOut_36_1 = (tg) (Object) stackIn_36_1;
                      stackOut_36_2 = ((fe) this).a(var13, param1 + 0, param7.b(var13), param5);
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      break L8;
                    }
                  }
                  bf.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, param7, 15553);
                  break L7;
                } else {
                  break L7;
                }
              }
              var11 = var11 + param6;
              ((fe) this).field_e[var12] = var14;
              var12++;
              continue L5;
            }
          }
        }
    }

    public fe() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new md();
        field_n = new String[]{"Reconnoitre", "Reveal two rooms at start of game. (Single use)"};
    }
}
