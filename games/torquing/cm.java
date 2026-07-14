/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends uj {
    private String field_d;
    static int field_m;
    private int field_i;
    private int field_e;
    static String field_j;
    private uc field_g;
    static int field_n;
    private int field_f;
    private int field_o;
    static String field_k;
    private int field_h;
    private boolean field_l;

    final void a(int param0, int param1, uc param2, int param3, String param4) {
        if (param4 == null) {
            ((cm) this).field_c = null;
            return;
        }
        if (((cm) this).field_g == param2) {
            if (((cm) this).field_l) {
                if (((cm) this).field_e == 1) {
                    if (null != ((cm) this).field_d) {
                        if (!(!((cm) this).field_d.equals((Object) (Object) param4))) {
                            return;
                        }
                    }
                }
            }
        }
        ((cm) this).field_e = 1;
        ((cm) this).field_l = true;
        ((cm) this).field_g = param2;
        kp var8 = this.a(param2, param3, param4, param1 ^ 1);
        int var7 = param2.a(param4);
        var8.field_b[param1] = -(var7 >> -1117462303) + param0;
        var8.field_b[param4.length()] = (var7 >> 1015020929) + param0;
        rd.a(param2, param1 + 10580, 0, param4, var8);
    }

    final void a(int param0, uc param1, byte param2, int param3, int param4, String param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        kp var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        kp stackIn_33_0 = null;
        kp stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        kp stackIn_34_0 = null;
        kp stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        kp stackIn_35_0 = null;
        kp stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        uc stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        uc stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        uc stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        kp stackOut_32_0 = null;
        kp stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        kp stackOut_34_0 = null;
        kp stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        kp stackOut_33_0 = null;
        kp stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        uc stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        uc stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        uc stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        L0: {
          var15 = Torquing.field_u;
          if (param0 != 0) {
            break L0;
          } else {
            param0 = param1.field_q;
            break L0;
          }
        }
        if (param5 != null) {
          L1: {
            if (param1 != ((cm) this).field_g) {
              break L1;
            } else {
              if (((cm) this).field_l) {
                break L1;
              } else {
                if (param6 != ((cm) this).field_e) {
                  break L1;
                } else {
                  if (param7 != ((cm) this).field_o) {
                    break L1;
                  } else {
                    if (param0 != ((cm) this).field_f) {
                      break L1;
                    } else {
                      if (param3 != ((cm) this).field_h) {
                        break L1;
                      } else {
                        if (((cm) this).field_i != param4) {
                          break L1;
                        } else {
                          if (((cm) this).field_d == null) {
                            break L1;
                          } else {
                            if (!((cm) this).field_d.equals((Object) (Object) param5)) {
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
          ((cm) this).field_h = param3;
          if (param2 == 26) {
            L2: {
              ((cm) this).field_l = false;
              ((cm) this).field_f = param0;
              ((cm) this).field_e = param6;
              ((cm) this).field_o = param7;
              ((cm) this).field_g = param1;
              ((cm) this).field_d = param5;
              ((cm) this).field_i = param4;
              var16 = new String[1 + param1.c(param5, param4)];
              var17 = var16;
              var10 = Math.max(1, param1.a(param5, new int[1], var17));
              if (((cm) this).field_o != 3) {
                break L2;
              } else {
                if (var10 == 1) {
                  ((cm) this).field_o = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              ((cm) this).field_c = new kp[var10];
              if (((cm) this).field_o != 0) {
                if (((cm) this).field_o != 1) {
                  if (((cm) this).field_o != 2) {
                    L4: {
                      var12 = (((cm) this).field_h + -(var10 * ((cm) this).field_f)) / (var10 - -1);
                      if (-1 < (var12 ^ -1)) {
                        var12 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((cm) this).field_f = ((cm) this).field_f + var12;
                    var11 = var12 + param1.field_x;
                    break L3;
                  } else {
                    var11 = -param1.field_t + ((cm) this).field_h + -(var10 * ((cm) this).field_f);
                    break L3;
                  }
                } else {
                  var11 = (((cm) this).field_h + -(var10 * ((cm) this).field_f) >> -700734943) + param1.field_x;
                  break L3;
                }
              } else {
                var11 = param1.field_x;
                break L3;
              }
            }
            var12 = 0;
            L5: while (true) {
              if (var12 >= var10) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = var11 + -param1.field_x;
                  stackOut_32_3 = param1.field_t + var11;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  if (var13 != null) {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = var13.length();
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    stackIn_35_4 = stackOut_34_4;
                    break L6;
                  } else {
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = 0;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_35_4 = stackOut_33_4;
                    break L6;
                  }
                }
                L7: {
                  new kp(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                  var14 = stackIn_35_0;
                  var14.field_b[0] = 0;
                  if (var13 != null) {
                    L8: {
                      var14.field_b[var13.length()] = param1.a(var13);
                      stackOut_37_0 = (uc) param1;
                      stackOut_37_1 = 10580;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if ((param6 ^ -1) != -4) {
                        stackOut_39_0 = (uc) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        break L8;
                      } else {
                        stackOut_38_0 = (uc) (Object) stackIn_38_0;
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = ((cm) this).a(-127, param1.a(var13), var13, param4);
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        break L8;
                      }
                    }
                    rd.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, var13, var14);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((cm) this).field_c[var12] = var14;
                var11 = var11 + param0;
                var12++;
                continue L5;
              }
            }
          } else {
            return;
          }
        } else {
          ((cm) this).field_c = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = (param1 * param1 >> -792541108) * param1 >> 116629388;
        int var3 = param1 * 6 + -61440;
        if (param0 < 27) {
            field_m = -76;
        }
        int var4 = (var3 * param1 >> -1307584404) + 40960;
        return var2 * var4 >> 2091207020;
    }

    public static void a(int param0) {
        field_j = null;
        field_k = null;
        if (param0 != 31003) {
            field_j = null;
        }
    }

    private final kp a(uc param0, int param1, String param2, int param3) {
        if (param3 != 1) {
            return null;
        }
        kp var6 = new kp(-param0.field_x + param1, param0.field_t + param1, param2.length());
        kp var5 = var6;
        ((cm) this).field_c = new kp[]{var6};
        return var5;
    }

    final static void a(byte param0, String param1) {
        wb.a(param1, 390);
        jk.a(ii.field_m, (byte) -79, false);
        if (param0 != -21) {
            field_k = null;
        }
    }

    final void a(int param0, int param1, uc param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((cm) this).field_c = null;
            return;
        }
        if (param1 != -22746) {
            ((cm) this).field_l = true;
        }
        if (param2 == ((cm) this).field_g) {
            if (((cm) this).field_l) {
                if ((((cm) this).field_e ^ -1) == -3) {
                    if (((cm) this).field_d != null) {
                        if (((cm) this).field_d.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((cm) this).field_l = true;
        ((cm) this).field_d = param3;
        ((cm) this).field_e = 2;
        ((cm) this).field_g = param2;
        kp var8 = this.a(param2, param0, param3, 1);
        kp var9 = var8;
        var9.field_b[0] = param4 + -param2.a(param3);
        var9.field_b[param3.length()] = param4;
        rd.a(param2, param1 ^ -29070, 0, param3, var9);
    }

    final void a(String param0, byte param1, uc param2, int param3, int param4) {
        if (param0 == null) {
            ((cm) this).field_c = null;
            return;
        }
        if (param2 == ((cm) this).field_g) {
            if (((cm) this).field_l) {
                if (((cm) this).field_e == 0) {
                    if (((cm) this).field_d != null) {
                        if (((cm) this).field_d.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((cm) this).field_e = 0;
        ((cm) this).field_d = param0;
        ((cm) this).field_l = true;
        ((cm) this).field_g = param2;
        kp var8 = this.a(param2, param3, param0, 1);
        kp var9 = var8;
        int var7 = -83 / ((param1 - -22) / 59);
        var8.field_b[0] = param4;
        var9.field_b[param0.length()] = param2.a(param0) + param4;
        rd.a(param2, 10580, 0, param0, var9);
    }

    public cm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 20;
        field_j = "Resume Game";
        field_k = "Go Back";
    }
}
