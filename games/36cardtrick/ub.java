/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends mj {
    private int field_l;
    private int field_g;
    static String field_k;
    private String field_j;
    private boolean field_m;
    private ee field_h;
    private int field_f;
    private int field_i;
    private int field_n;

    final void a(String param0, int param1, ee param2, int param3, int param4) {
        if (!(param0 != null)) {
            ((ub) this).field_d = null;
            return;
        }
        if (param2 == ((ub) this).field_h) {
            if (((ub) this).field_m) {
                if (((ub) this).field_i == 0) {
                    if (((ub) this).field_j != null) {
                        if (((ub) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        if (param1 != 1) {
            return;
        }
        ((ub) this).field_h = param2;
        ((ub) this).field_m = true;
        ((ub) this).field_j = param0;
        ((ub) this).field_i = 0;
        di var7 = this.a(param3, (byte) -88, param2, param0);
        di var8 = var7;
        var7.field_a[0] = param4;
        var8.field_a[param0.length()] = param4 - -param2.a(param0);
        s.a(param2, (byte) 61, 0, var8, param0);
    }

    final void a(String param0, byte param1, int param2, ee param3, int param4) {
        if (!(param0 != null)) {
            ((ub) this).field_d = null;
            return;
        }
        if (param1 >= -86) {
            return;
        }
        if (param3 == ((ub) this).field_h) {
            if (((ub) this).field_m) {
                if (2 == ((ub) this).field_i) {
                    if (((ub) this).field_j != null) {
                        if (((ub) this).field_j.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((ub) this).field_h = param3;
        ((ub) this).field_j = param0;
        ((ub) this).field_m = true;
        ((ub) this).field_i = 2;
        di var8 = this.a(param2, (byte) -103, param3, param0);
        di var9 = var8;
        var9.field_a[0] = -param3.a(param0) + param4;
        var9.field_a[param0.length()] = param4;
        s.a(param3, (byte) 61, 0, var9, param0);
    }

    private final di a(int param0, byte param1, ee param2, String param3) {
        int var5 = -67 % ((-6 - param1) / 42);
        di var6 = new di(-param2.field_s + param0, param0 - -param2.field_x, param3.length());
        ((ub) this).field_d = new di[]{var6};
        return var6;
    }

    final static void c(int param0) {
        if (param0 != 0) {
            ub.c(-117);
        }
        uk.a("", param0 + -23804, (String) null);
    }

    public static void d(int param0) {
        if (param0 > -112) {
            ub.c(-70);
        }
        field_k = null;
    }

    final void a(ee param0, int param1, String param2, int param3, int param4) {
        if (!(param2 != null)) {
            ((ub) this).field_d = null;
            return;
        }
        if (param0 == ((ub) this).field_h) {
            if (((ub) this).field_m) {
                if (1 == ((ub) this).field_i) {
                    if (null != ((ub) this).field_j) {
                        if (((ub) this).field_j.equals((Object) (Object) param2)) {
                            return;
                        }
                    }
                }
            }
        }
        ((ub) this).field_h = param0;
        ((ub) this).field_m = true;
        ((ub) this).field_i = 1;
        int var6 = 99 % ((35 - param3) / 59);
        di var7 = this.a(param1, (byte) 41, param0, param2);
        int var8 = param0.a(param2);
        var7.field_a[0] = param4 - (var8 >> 128144513);
        var7.field_a[param2.length()] = param4 - -(var8 >> -1397818463);
        s.a(param0, (byte) 61, 0, var7, param2);
    }

    final void a(int param0, int param1, int param2, int param3, ee param4, int param5, String param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        di var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        di stackIn_34_0 = null;
        di stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        di stackIn_35_0 = null;
        di stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        di stackIn_36_0 = null;
        di stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        ee stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ee stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ee stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        di stackOut_33_0 = null;
        di stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        di stackOut_35_0 = null;
        di stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        di stackOut_34_0 = null;
        di stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        ee stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ee stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        ee stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        L0: {
          var15 = Main.field_T;
          if (0 == param7) {
            param7 = param4.field_E;
            break L0;
          } else {
            break L0;
          }
        }
        if (param6 == null) {
          ((ub) this).field_d = null;
          return;
        } else {
          L1: {
            if (param4 != ((ub) this).field_h) {
              break L1;
            } else {
              if (((ub) this).field_m) {
                break L1;
              } else {
                if (param5 != ((ub) this).field_i) {
                  break L1;
                } else {
                  if (((ub) this).field_n != param2) {
                    break L1;
                  } else {
                    if (param7 != ((ub) this).field_g) {
                      break L1;
                    } else {
                      if (param0 != ((ub) this).field_f) {
                        break L1;
                      } else {
                        if (param3 != ((ub) this).field_l) {
                          break L1;
                        } else {
                          if (((ub) this).field_j == null) {
                            break L1;
                          } else {
                            if (((ub) this).field_j.equals((Object) (Object) param6)) {
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
          ((ub) this).field_f = param0;
          ((ub) this).field_l = param3;
          if (param1 == 841570337) {
            L2: {
              ((ub) this).field_h = param4;
              ((ub) this).field_n = param2;
              ((ub) this).field_i = param5;
              ((ub) this).field_g = param7;
              ((ub) this).field_j = param6;
              ((ub) this).field_m = false;
              var16 = new String[1 + param4.b(param6, param3)];
              var17 = var16;
              var10 = Math.max(1, param4.a(param6, new int[1], var17));
              if (-4 != (((ub) this).field_n ^ -1)) {
                break L2;
              } else {
                if (var10 != 1) {
                  break L2;
                } else {
                  ((ub) this).field_n = 1;
                  break L2;
                }
              }
            }
            L3: {
              if (((ub) this).field_n != 0) {
                if (((ub) this).field_n != 1) {
                  if (-3 == ((ub) this).field_n) {
                    var11 = ((ub) this).field_f - (param4.field_x - -(var10 * ((ub) this).field_g));
                    break L3;
                  } else {
                    L4: {
                      var12 = (((ub) this).field_f - var10 * ((ub) this).field_g) / (var10 + 1);
                      if (-1 <= var12) {
                        break L4;
                      } else {
                        var12 = 0;
                        break L4;
                      }
                    }
                    var11 = param4.field_s + var12;
                    ((ub) this).field_g = ((ub) this).field_g + var12;
                    break L3;
                  }
                } else {
                  var11 = (-(((ub) this).field_g * var10) + ((ub) this).field_f >> 841570337) + param4.field_s;
                  break L3;
                }
              } else {
                var11 = param4.field_s;
                break L3;
              }
            }
            ((ub) this).field_d = new di[var10];
            var12 = 0;
            L5: while (true) {
              if (var12 >= var10) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = -param4.field_s + var11;
                  stackOut_33_3 = param4.field_x + var11;
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
                    break L6;
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
                    break L6;
                  }
                }
                L7: {
                  var14 = new di(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                  var14.field_a[0] = 0;
                  if (var13 == null) {
                    break L7;
                  } else {
                    L8: {
                      var14.field_a[var13.length()] = param4.a(var13);
                      stackOut_37_0 = (ee) param4;
                      stackOut_37_1 = 61;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (param5 != 3) {
                        stackOut_39_0 = (ee) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        break L8;
                      } else {
                        stackOut_38_0 = (ee) (Object) stackIn_38_0;
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = ((ub) this).a(param3, param4.a(var13), var13, -53);
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        break L8;
                      }
                    }
                    s.a(stackIn_40_0, (byte) stackIn_40_1, stackIn_40_2, var14, var13);
                    break L7;
                  }
                }
                ((ub) this).field_d[var12] = var14;
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

    public ub() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = null;
    }
}
