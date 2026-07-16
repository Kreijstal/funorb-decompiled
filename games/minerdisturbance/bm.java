/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends nf {
    private int field_s;
    private we field_m;
    private int field_p;
    private int field_j;
    private String field_n;
    private boolean field_t;
    private int field_l;
    static ag field_o;
    private int field_i;
    static String field_k;
    static String field_r;
    static String field_q;

    final static java.applet.Applet c(int param0) {
        if (param0 >= -73) {
            return null;
        }
        if (of.field_b != null) {
            return of.field_b;
        }
        return (java.applet.Applet) (Object) j.field_h;
    }

    final void a(int param0, int param1, we param2, String param3, int param4, byte param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mg stackIn_34_0 = null;
        mg stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        mg stackIn_35_0 = null;
        mg stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        mg stackIn_36_0 = null;
        mg stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        we stackIn_38_0 = null;
        String stackIn_38_1 = null;
        we stackIn_39_0 = null;
        String stackIn_39_1 = null;
        we stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        mg stackOut_33_0 = null;
        mg stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        mg stackOut_35_0 = null;
        mg stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        mg stackOut_34_0 = null;
        mg stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        we stackOut_37_0 = null;
        String stackOut_37_1 = null;
        we stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        we stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        L0: {
          var15 = MinerDisturbance.field_ab;
          if ((param6 ^ -1) != -1) {
            break L0;
          } else {
            param6 = param2.field_G;
            break L0;
          }
        }
        if (param3 == null) {
          ((bm) this).field_f = null;
          return;
        } else {
          L1: {
            if (param2 != ((bm) this).field_m) {
              break L1;
            } else {
              if (((bm) this).field_t) {
                break L1;
              } else {
                if ((((bm) this).field_l ^ -1) != (param7 ^ -1)) {
                  break L1;
                } else {
                  if (param0 != ((bm) this).field_j) {
                    break L1;
                  } else {
                    if (((bm) this).field_i != param6) {
                      break L1;
                    } else {
                      if ((((bm) this).field_p ^ -1) != (param1 ^ -1)) {
                        break L1;
                      } else {
                        if (((bm) this).field_s != param4) {
                          break L1;
                        } else {
                          if (((bm) this).field_n == null) {
                            break L1;
                          } else {
                            if (((bm) this).field_n.equals((Object) (Object) param3)) {
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
            ((bm) this).field_l = param7;
            ((bm) this).field_n = param3;
            ((bm) this).field_s = param4;
            ((bm) this).field_t = false;
            ((bm) this).field_p = param1;
            ((bm) this).field_i = param6;
            if (param5 > 61) {
              break L2;
            } else {
              field_r = null;
              break L2;
            }
          }
          L3: {
            ((bm) this).field_j = param0;
            ((bm) this).field_m = param2;
            var16 = new String[param2.a(param3, param4) + 1];
            var17 = var16;
            var10 = Math.max(1, param2.a(param3, new int[1], var17));
            if ((((bm) this).field_j ^ -1) != -4) {
              break L3;
            } else {
              if (-2 == (var10 ^ -1)) {
                ((bm) this).field_j = 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            ((bm) this).field_f = new mg[var10];
            if (((bm) this).field_j != 0) {
              if (((bm) this).field_j == 1) {
                var11 = param2.field_I + (((bm) this).field_p + -(((bm) this).field_i * var10) >> 1069152065);
                break L4;
              } else {
                if (((bm) this).field_j == 2) {
                  var11 = ((bm) this).field_p + -param2.field_E + -(((bm) this).field_i * var10);
                  break L4;
                } else {
                  L5: {
                    var12 = (-(((bm) this).field_i * var10) + ((bm) this).field_p) / (1 + var10);
                    if (-1 >= (var12 ^ -1)) {
                      break L5;
                    } else {
                      var12 = 0;
                      break L5;
                    }
                  }
                  ((bm) this).field_i = ((bm) this).field_i + var12;
                  var11 = var12 + param2.field_I;
                  break L4;
                }
              }
            } else {
              var11 = param2.field_I;
              break L4;
            }
          }
          var12 = 0;
          L6: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L7: {
                var13 = var16[var12];
                stackOut_33_0 = null;
                stackOut_33_1 = null;
                stackOut_33_2 = -param2.field_I + var11;
                stackOut_33_3 = param2.field_E + var11;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                stackIn_35_3 = stackOut_33_3;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                stackIn_34_3 = stackOut_33_3;
                if (var13 == null) {
                  stackOut_35_0 = null;
                  stackOut_35_1 = null;
                  stackOut_35_2 = stackIn_35_2;
                  stackOut_35_3 = stackIn_35_3;
                  stackOut_35_4 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  stackIn_36_4 = stackOut_35_4;
                  break L7;
                } else {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = var13.length();
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  stackIn_36_3 = stackOut_34_3;
                  stackIn_36_4 = stackOut_34_4;
                  break L7;
                }
              }
              L8: {
                var14 = new mg(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                var14.field_d[0] = 0;
                if (var13 == null) {
                  break L8;
                } else {
                  L9: {
                    var14.field_d[var13.length()] = param2.a(var13);
                    stackOut_37_0 = (we) param2;
                    stackOut_37_1 = (String) var13;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if ((param7 ^ -1) == -4) {
                      stackOut_39_0 = (we) (Object) stackIn_39_0;
                      stackOut_39_1 = (String) (Object) stackIn_39_1;
                      stackOut_39_2 = ((bm) this).a(101, var13, param2.a(var13), param4);
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      break L9;
                    } else {
                      stackOut_38_0 = (we) (Object) stackIn_38_0;
                      stackOut_38_1 = (String) (Object) stackIn_38_1;
                      stackOut_38_2 = 0;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      break L9;
                    }
                  }
                  pf.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, -19453, var14);
                  break L8;
                }
              }
              var11 = var11 + param6;
              ((bm) this).field_f[var12] = var14;
              var12++;
              continue L6;
            }
          }
        }
    }

    private final mg a(int param0, String param1, byte param2, we param3) {
        mg var6 = new mg(param0 - param3.field_I, param0 + param3.field_E, param1.length());
        mg var5 = var6;
        ((bm) this).field_f = new mg[]{var6};
        if (param2 < 18) {
            return null;
        }
        return var5;
    }

    final void a(int param0, int param1, String param2, we param3, int param4) {
        if (!(param2 != null)) {
            ((bm) this).field_f = null;
            return;
        }
        if (param3 == ((bm) this).field_m) {
            if (((bm) this).field_t) {
                if (-3 == (((bm) this).field_l ^ -1)) {
                    if (((bm) this).field_n != null) {
                        if (!(!((bm) this).field_n.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((bm) this).field_l = 2;
        ((bm) this).field_n = param2;
        ((bm) this).field_t = true;
        ((bm) this).field_m = param3;
        mg var8 = this.a(param4, param2, (byte) 51, param3);
        mg var9 = var8;
        var9.field_d[0] = param1 + -param3.a(param2);
        var9.field_d[param2.length()] = param1;
        pf.a(param3, param2, param0, -19453, var9);
    }

    public static void d(int param0) {
        if (param0 != 0) {
            field_o = null;
        }
        field_r = null;
        field_q = null;
        field_k = null;
        field_o = null;
    }

    final void a(int param0, we param1, String param2, int param3, int param4) {
        if (!(param2 != null)) {
            ((bm) this).field_f = null;
            return;
        }
        if (param1 == ((bm) this).field_m) {
            if (((bm) this).field_t) {
                if (((bm) this).field_l == 0) {
                    if (((bm) this).field_n != null) {
                        if (!(!((bm) this).field_n.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((bm) this).field_m = param1;
        ((bm) this).field_n = param2;
        ((bm) this).field_l = 0;
        ((bm) this).field_t = true;
        mg var7 = this.a(param4, param2, (byte) 19, param1);
        mg var8 = var7;
        if (param3 <= 62) {
            ((bm) this).field_n = null;
        }
        var7.field_d[0] = param0;
        var8.field_d[param2.length()] = param1.a(param2) + param0;
        pf.a(param1, param2, 0, -19453, var8);
    }

    public bm() {
    }

    final void a(String param0, int param1, int param2, we param3, int param4) {
        if (param0 == null) {
            ((bm) this).field_f = null;
            return;
        }
        if (param3 == ((bm) this).field_m) {
            if (((bm) this).field_t) {
                if (((bm) this).field_l == 1) {
                    if (null != ((bm) this).field_n) {
                        if (((bm) this).field_n.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((bm) this).field_t = true;
        ((bm) this).field_m = param3;
        ((bm) this).field_l = 1;
        mg var8 = this.a(param2, param0, (byte) 87, param3);
        int var7 = param3.a(param0);
        var8.field_d[0] = param4 + -(var7 >> -1445522975);
        if (param1 != 27994) {
            ((bm) this).field_l = 113;
        }
        var8.field_d[param0.length()] = param4 - -(var7 >> -45995743);
        pf.a(param3, param0, 0, -19453, var8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ag();
        field_k = "Change display name";
        field_r = "Player";
    }
}
