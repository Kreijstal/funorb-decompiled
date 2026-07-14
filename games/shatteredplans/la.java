/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends qo {
    private int field_l;
    private int field_m;
    static String field_h;
    private boolean field_f;
    static String field_o;
    private int field_p;
    static bc field_k;
    static String field_n;
    private String field_g;
    private nq field_j;
    static String[] field_r;
    private int field_q;
    private int field_i;

    final void a(int param0, String param1, int param2, nq param3, int param4) {
        if (!(param1 != null)) {
            ((la) this).field_d = null;
            return;
        }
        if (((la) this).field_j == param3) {
            if (((la) this).field_f) {
                if ((((la) this).field_p ^ -1) == -2) {
                    if (((la) this).field_g != null) {
                        if (!(!((la) this).field_g.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((la) this).field_p = 1;
        ((la) this).field_f = true;
        ((la) this).field_j = param3;
        ha var8 = this.a(param0, param3, param1, (byte) 15);
        int var7 = param3.c(param1);
        var8.field_b[param2] = -(var7 >> -338954815) + param4;
        var8.field_b[param1.length()] = param4 + (var7 >> -433041023);
        ta.a(param1, var8, 27329, 0, param3);
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, nq param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ha var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        ha stackIn_30_0 = null;
        ha stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        ha stackIn_31_0 = null;
        ha stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        ha stackIn_32_0 = null;
        ha stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        String stackIn_35_0 = null;
        ha stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        String stackIn_36_0 = null;
        ha stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        String stackIn_37_0 = null;
        ha stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        ha stackOut_29_0 = null;
        ha stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        ha stackOut_31_0 = null;
        ha stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        ha stackOut_30_0 = null;
        ha stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        String stackOut_34_0 = null;
        ha stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        String stackOut_36_0 = null;
        ha stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        String stackOut_35_0 = null;
        ha stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        L0: {
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param7 != param1) {
            break L0;
          } else {
            param7 = param6.field_L;
            break L0;
          }
        }
        if (param0 != null) {
          L1: {
            if (((la) this).field_j != param6) {
              break L1;
            } else {
              if (((la) this).field_f) {
                break L1;
              } else {
                if (param2 != ((la) this).field_p) {
                  break L1;
                } else {
                  if (param3 != ((la) this).field_l) {
                    break L1;
                  } else {
                    if (((la) this).field_m != param7) {
                      break L1;
                    } else {
                      if (param5 != ((la) this).field_i) {
                        break L1;
                      } else {
                        if (((la) this).field_q != param4) {
                          break L1;
                        } else {
                          if (((la) this).field_g == null) {
                            break L1;
                          } else {
                            if (((la) this).field_g.equals((Object) (Object) param0)) {
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
            ((la) this).field_f = false;
            ((la) this).field_j = param6;
            ((la) this).field_l = param3;
            ((la) this).field_q = param4;
            ((la) this).field_p = param2;
            ((la) this).field_g = param0;
            ((la) this).field_i = param5;
            ((la) this).field_m = param7;
            var16 = new String[1 + param6.a(param0, param4)];
            var17 = var16;
            var10 = Math.max(1, param6.a(param0, new int[1], var17));
            if ((((la) this).field_l ^ -1) != -4) {
              break L2;
            } else {
              if (var10 != -2) {
                break L2;
              } else {
                ((la) this).field_l = 1;
                break L2;
              }
            }
          }
          L3: {
            if (-1 == ((la) this).field_l) {
              var11 = param6.field_J;
              break L3;
            } else {
              if (1 == ((la) this).field_l) {
                var11 = param6.field_J + (((la) this).field_i - var10 * ((la) this).field_m >> -1973673983);
                break L3;
              } else {
                if (2 != ((la) this).field_l) {
                  L4: {
                    var12 = (((la) this).field_i + -(((la) this).field_m * var10)) / (var10 - -1);
                    if (0 <= var12) {
                      break L4;
                    } else {
                      var12 = 0;
                      break L4;
                    }
                  }
                  var11 = var12 + param6.field_J;
                  ((la) this).field_m = ((la) this).field_m + var12;
                  break L3;
                } else {
                  var11 = ((la) this).field_i + -param6.field_q - ((la) this).field_m * var10;
                  break L3;
                }
              }
            }
          }
          ((la) this).field_d = new ha[var10];
          var12 = 0;
          L5: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L6: {
                var13 = var16[var12];
                stackOut_29_0 = null;
                stackOut_29_1 = null;
                stackOut_29_2 = -param6.field_J + var11;
                stackOut_29_3 = var11 + param6.field_q;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_31_2 = stackOut_29_2;
                stackIn_31_3 = stackOut_29_3;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                stackIn_30_2 = stackOut_29_2;
                stackIn_30_3 = stackOut_29_3;
                if (var13 != null) {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = var13.length();
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  stackIn_32_4 = stackOut_31_4;
                  break L6;
                } else {
                  stackOut_30_0 = null;
                  stackOut_30_1 = null;
                  stackOut_30_2 = stackIn_30_2;
                  stackOut_30_3 = stackIn_30_3;
                  stackOut_30_4 = 0;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  stackIn_32_4 = stackOut_30_4;
                  break L6;
                }
              }
              L7: {
                new ha(stackIn_32_2, stackIn_32_3, stackIn_32_4);
                var14 = stackIn_32_0;
                var14.field_b[0] = 0;
                if (var13 != null) {
                  L8: {
                    var14.field_b[var13.length()] = param6.c(var13);
                    stackOut_34_0 = (String) var13;
                    stackOut_34_1 = (ha) var14;
                    stackOut_34_2 = param1 + 27329;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    if ((param2 ^ -1) == -4) {
                      stackOut_36_0 = (String) (Object) stackIn_36_0;
                      stackOut_36_1 = (ha) (Object) stackIn_36_1;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = ((la) this).a(param1 ^ -28135, param4, param6.c(var13), var13);
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      break L8;
                    } else {
                      stackOut_35_0 = (String) (Object) stackIn_35_0;
                      stackOut_35_1 = (ha) (Object) stackIn_35_1;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = 0;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      break L8;
                    }
                  }
                  ta.a(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, param6);
                  break L7;
                } else {
                  break L7;
                }
              }
              ((la) this).field_d[var12] = var14;
              var11 = var11 + param7;
              var12++;
              continue L5;
            }
          }
        } else {
          ((la) this).field_d = null;
          return;
        }
    }

    private final ha a(int param0, nq param1, String param2, byte param3) {
        ha var6 = new ha(-param1.field_J + param0, param0 - -param1.field_q, param2.length());
        ha var5 = var6;
        ((la) this).field_d = new ha[]{var6};
        if (param3 != 15) {
            return null;
        }
        return var5;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 36) {
            la.a((byte) 14);
        }
        field_k = null;
        field_r = null;
        field_n = null;
        field_o = null;
    }

    final void a(nq param0, int param1, int param2, String param3, int param4) {
        if (param3 == null) {
            ((la) this).field_d = null;
            return;
        }
        if (((la) this).field_j == param0) {
            if (((la) this).field_f) {
                if (0 == ((la) this).field_p) {
                    if (null != ((la) this).field_g) {
                        if (!(!((la) this).field_g.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((la) this).field_j = param0;
        ((la) this).field_g = param3;
        ((la) this).field_f = true;
        ((la) this).field_p = 0;
        if (param2 != -4) {
            ((la) this).field_p = -108;
        }
        ha var7 = this.a(param1, param0, param3, (byte) 15);
        ha var8 = var7;
        var7.field_b[0] = param4;
        var8.field_b[param3.length()] = param0.c(param3) + param4;
        ta.a(param3, var8, param2 + 27333, 0, param0);
    }

    final void a(int param0, int param1, nq param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((la) this).field_d = null;
            return;
        }
        if (param2 == ((la) this).field_j) {
            if (((la) this).field_f) {
                if ((((la) this).field_p ^ -1) == -3) {
                    if (((la) this).field_g != null) {
                        if (((la) this).field_g.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((la) this).field_f = true;
        ((la) this).field_j = param2;
        ((la) this).field_p = 2;
        ((la) this).field_g = param3;
        int var7 = 79 / ((59 - param0) / 47);
        ha var9 = this.a(param1, param2, param3, (byte) 15);
        ha var10 = var9;
        var10.field_b[0] = -param2.c(param3) + param4;
        var10.field_b[param3.length()] = param4;
        ta.a(param3, var10, 27329, 0, param2);
    }

    public la() {
    }

    final static void a(boolean param0) {
        Object var2 = null;
        ce.a("", (String) null, (byte) 3);
        if (param0) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Exploiting a bug";
        field_n = "Game Type: Capture and Hold";
        field_r = new String[]{null, "turntime_icons", "game_icons", "galaxysize_icons", "type_icons"};
    }
}
