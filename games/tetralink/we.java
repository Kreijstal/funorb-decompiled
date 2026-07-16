/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends hi {
    private String field_j;
    private int field_i;
    static mk field_e;
    private int field_f;
    static String field_m;
    static String field_n;
    private int field_h;
    private int field_p;
    private jb field_g;
    static jb field_k;
    private int field_l;
    private boolean field_o;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var14 = TetraLink.field_J;
        if (param5 < param3) {
          if (param2 > param5 + 1) {
            L0: {
              if (5 + param5 >= param2) {
                break L0;
              } else {
                if (param6 == param1) {
                  break L0;
                } else {
                  var7 = (param1 >> -1284620991) - -(param6 >> 577326401) - -(1 & (param6 & param1));
                  var8 = param5;
                  var9 = param6;
                  var10 = param1;
                  var11 = param5;
                  L1: while (true) {
                    if (var11 >= param2) {
                      we.a(0, var9, var8, param3, param4, param5, param6);
                      we.a(param0 ^ param0, param1, param2, param3, param4, var8, var10);
                      return;
                    } else {
                      L2: {
                        var12 = qd.field_W[var11];
                        if (!param4) {
                          stackOut_20_0 = fe.field_b[var12];
                          stackIn_21_0 = stackOut_20_0;
                          break L2;
                        } else {
                          stackOut_19_0 = lb.field_P[var12];
                          stackIn_21_0 = stackOut_19_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_21_0;
                      if (var13 <= var7) {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        qd.field_W[var11] = qd.field_W[var8];
                        int incrementValue$1 = var8;
                        var8++;
                        qd.field_W[incrementValue$1] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param2;
            L3: while (true) {
              if (param5 >= var7) {
                return;
              } else {
                var8 = param5;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = qd.field_W[var8];
                    var10 = qd.field_W[var8 + 1];
                    if (om.a(param4, var10, 113, var9)) {
                      qd.field_W[var8] = var10;
                      qd.field_W[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static bf a(int param0, ee param1) {
        bf var2 = new bf(param1, (mc) (Object) param1);
        ha.field_b.a((mc) (Object) var2, false);
        u.field_g.a((eb) (Object) param1);
        if (param0 != -11040) {
            field_e = null;
        }
        return var2;
    }

    final void a(String param0, int param1, int param2, boolean param3, jb param4) {
        if (!(param0 != null)) {
            ((we) this).field_c = null;
            return;
        }
        if (param4 == ((we) this).field_g) {
            if (((we) this).field_o) {
                if (((we) this).field_l == 2) {
                    if (((we) this).field_j != null) {
                        if (((we) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((we) this).field_j = param0;
        ((we) this).field_g = param4;
        ((we) this).field_l = 2;
        ((we) this).field_o = true;
        bk var8 = this.a(param0, param1, -19395, param4);
        bk var9 = var8;
        var9.field_j[0] = -param4.b(param0) + param2;
        var9.field_j[param0.length()] = param2;
        la.a(param0, var9, param4, param3, 0);
    }

    final void a(String param0, byte param1, jb param2, int param3, int param4) {
        if (param0 == null) {
            ((we) this).field_c = null;
            return;
        }
        if (((we) this).field_g == param2) {
            if (((we) this).field_o) {
                if (((we) this).field_l == 1) {
                    if (null != ((we) this).field_j) {
                        if (((we) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        if (param1 != 124) {
            ((we) this).field_o = true;
        }
        ((we) this).field_o = true;
        ((we) this).field_g = param2;
        ((we) this).field_l = 1;
        bk var8 = this.a(param0, param4, -19395, param2);
        int var7 = param2.b(param0);
        var8.field_j[0] = param3 - (var7 >> -1529841663);
        var8.field_j[param0.length()] = param3 - -(var7 >> -1135519039);
        la.a(param0, var8, param2, false, 0);
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (param2 != -2) {
            return;
        }
        gh.a((byte) 116, param0);
        hj.a(param0, param3, param1, false);
    }

    final void a(int param0, jb param1, int param2, int param3, String param4) {
        if (param4 == null) {
            ((we) this).field_c = null;
            return;
        }
        if (param1 == ((we) this).field_g) {
            if (((we) this).field_o) {
                if (0 == ((we) this).field_l) {
                    if (null != ((we) this).field_j) {
                        if (!(!((we) this).field_j.equals((Object) (Object) param4))) {
                            return;
                        }
                    }
                }
            }
        }
        ((we) this).field_g = param1;
        ((we) this).field_j = param4;
        ((we) this).field_o = true;
        ((we) this).field_l = 0;
        bk var7 = this.a(param4, param3, -19395, param1);
        bk var8 = var7;
        var7.field_j[param2] = param0;
        var8.field_j[param4.length()] = param1.b(param4) + param0;
        la.a(param4, var8, param1, false, 0);
    }

    final void a(int param0, int param1, String param2, int param3, jb param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bk var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        bk stackIn_34_0 = null;
        bk stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        bk stackIn_35_0 = null;
        bk stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        bk stackIn_36_0 = null;
        bk stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        String stackIn_39_0 = null;
        bk stackIn_39_1 = null;
        jb stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        String stackIn_40_0 = null;
        bk stackIn_40_1 = null;
        jb stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        String stackIn_41_0 = null;
        bk stackIn_41_1 = null;
        jb stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        bk stackOut_33_0 = null;
        bk stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        bk stackOut_35_0 = null;
        bk stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        bk stackOut_34_0 = null;
        bk stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        String stackOut_38_0 = null;
        bk stackOut_38_1 = null;
        jb stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        String stackOut_40_0 = null;
        bk stackOut_40_1 = null;
        jb stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        String stackOut_39_0 = null;
        bk stackOut_39_1 = null;
        jb stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        L0: {
          var15 = TetraLink.field_J;
          if (param7 == 0) {
            param7 = param4.field_H;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 == null) {
          ((we) this).field_c = null;
          return;
        } else {
          L1: {
            if (param4 != ((we) this).field_g) {
              break L1;
            } else {
              if (((we) this).field_o) {
                break L1;
              } else {
                if (((we) this).field_l != param5) {
                  break L1;
                } else {
                  if ((((we) this).field_f ^ -1) != (param6 ^ -1)) {
                    break L1;
                  } else {
                    if ((param7 ^ -1) != (((we) this).field_p ^ -1)) {
                      break L1;
                    } else {
                      if ((((we) this).field_h ^ -1) != (param1 ^ -1)) {
                        break L1;
                      } else {
                        if (param3 != ((we) this).field_i) {
                          break L1;
                        } else {
                          if (null == ((we) this).field_j) {
                            break L1;
                          } else {
                            if (!((we) this).field_j.equals((Object) (Object) param2)) {
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
          ((we) this).field_p = param7;
          ((we) this).field_i = param3;
          ((we) this).field_f = param6;
          ((we) this).field_h = param1;
          ((we) this).field_l = param5;
          ((we) this).field_j = param2;
          if (param0 == -24340) {
            L2: {
              ((we) this).field_g = param4;
              ((we) this).field_o = false;
              var16 = new String[1 + param4.c(param2, param3)];
              var17 = var16;
              var10 = Math.max(1, param4.a(param2, new int[1], var17));
              if (-4 != (((we) this).field_f ^ -1)) {
                break L2;
              } else {
                if (-2 != (var10 ^ -1)) {
                  break L2;
                } else {
                  ((we) this).field_f = 1;
                  break L2;
                }
              }
            }
            L3: {
              ((we) this).field_c = new bk[var10];
              if (((we) this).field_f == 0) {
                var11 = param4.field_N;
                break L3;
              } else {
                if (1 != ((we) this).field_f) {
                  if (2 == ((we) this).field_f) {
                    var11 = -(var10 * ((we) this).field_p) + (-param4.field_K + ((we) this).field_h);
                    break L3;
                  } else {
                    L4: {
                      var12 = (-(((we) this).field_p * var10) + ((we) this).field_h) / (1 + var10);
                      if (-1 < (var12 ^ -1)) {
                        var12 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((we) this).field_p = ((we) this).field_p + var12;
                    var11 = var12 + param4.field_N;
                    break L3;
                  }
                } else {
                  var11 = (((we) this).field_h + -(var10 * ((we) this).field_p) >> -704354079) + param4.field_N;
                  break L3;
                }
              }
            }
            var12 = 0;
            L5: while (true) {
              if (var10 <= var12) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = var11 + -param4.field_N;
                  stackOut_33_3 = var11 + param4.field_K;
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
                  var14 = new bk(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                  var14.field_j[0] = 0;
                  if (var13 != null) {
                    L8: {
                      var14.field_j[var13.length()] = param4.b(var13);
                      stackOut_38_0 = (String) var13;
                      stackOut_38_1 = (bk) var14;
                      stackOut_38_2 = (jb) param4;
                      stackOut_38_3 = 0;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      stackIn_39_3 = stackOut_38_3;
                      if (-4 == (param5 ^ -1)) {
                        stackOut_40_0 = (String) (Object) stackIn_40_0;
                        stackOut_40_1 = (bk) (Object) stackIn_40_1;
                        stackOut_40_2 = (jb) (Object) stackIn_40_2;
                        stackOut_40_3 = stackIn_40_3;
                        stackOut_40_4 = ((we) this).a(param4.b(var13), (byte) -126, param3, var13);
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        stackIn_41_3 = stackOut_40_3;
                        stackIn_41_4 = stackOut_40_4;
                        break L8;
                      } else {
                        stackOut_39_0 = (String) (Object) stackIn_39_0;
                        stackOut_39_1 = (bk) (Object) stackIn_39_1;
                        stackOut_39_2 = (jb) (Object) stackIn_39_2;
                        stackOut_39_3 = stackIn_39_3;
                        stackOut_39_4 = 0;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        stackIn_41_3 = stackOut_39_3;
                        stackIn_41_4 = stackOut_39_4;
                        break L8;
                      }
                    }
                    la.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3 != 0, stackIn_41_4);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((we) this).field_c[var12] = var14;
                var11 = var11 + param7;
                var12++;
                continue L5;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_n = null;
        }
        field_e = null;
        field_k = null;
        field_m = null;
        field_n = null;
    }

    private final bk a(String param0, int param1, int param2, jb param3) {
        if (param2 != -19395) {
            we.a(-73, 23, -34, 70, true, 88, 94);
        }
        bk var6 = new bk(-param3.field_N + param1, param1 + param3.field_K, param0.length());
        bk var5 = var6;
        ((we) this).field_c = new bk[]{var6};
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var11 = 0;
        int var12 = 0;
        int var13 = TetraLink.field_J;
        int var7 = li.field_l[0].field_t + (param5 - 3);
        int var8 = param0 + li.field_l[0].field_F + -3;
        int var9 = -li.field_l[2].field_t + -li.field_l[0].field_t + param2 - -6;
        int var10 = -li.field_l[6].field_F + (-li.field_l[0].field_F + 6 + param3);
        for (var11 = 0; var11 < 48; var11++) {
            var12 = !param6 ? -(var11 * 5) + 239 : var11 * 5 + 4;
            ra.c(var11 + var7, var8, var10, var12);
            ra.c(-var11 + (-1 + var7) - -var9, var8, var10, var12);
        }
        var11 = !param6 ? 4 : 244;
        ra.c(48 + var7, var8, var9 + -96, var10, var11);
        qj.a(param2, (byte) -36, li.field_l, param5, param3, param0);
        if (param4 <= 39) {
            field_e = null;
        }
    }

    public we() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Not available in 2D mode";
        field_m = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
