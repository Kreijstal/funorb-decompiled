/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends vv {
    static String field_n;
    private int field_i;
    private po field_m;
    static int field_r;
    private int field_l;
    private boolean field_f;
    static kv[] field_g;
    static int field_q;
    static int field_h;
    private int field_o;
    private String field_j;
    private int field_k;
    private int field_p;

    final void a(po param0, String param1, int param2, int param3, int param4) {
        if (param1 == null) {
            ((tq) this).field_a = null;
            return;
        }
        if (((tq) this).field_m == param0) {
            if (((tq) this).field_f) {
                if ((((tq) this).field_l ^ -1) == -3) {
                    if (null != ((tq) this).field_j) {
                        if (!(!((tq) this).field_j.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((tq) this).field_f = true;
        ((tq) this).field_j = param1;
        ((tq) this).field_l = param4;
        ((tq) this).field_m = param0;
        mla var8 = this.a(param2, param4 + -30329, param0, param1);
        mla var9 = var8;
        var9.field_a[0] = param3 - param0.a(param1);
        var9.field_a[param1.length()] = param3;
        jia.a(param0, var9, 0, (byte) -79, param1);
    }

    final void a(int param0, int param1, po param2, String param3, int param4) {
        if (!(param3 != null)) {
            ((tq) this).field_a = null;
            return;
        }
        if (param2 == ((tq) this).field_m) {
            if (((tq) this).field_f) {
                if (((tq) this).field_l == 1) {
                    if (null != ((tq) this).field_j) {
                        if (!(!((tq) this).field_j.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((tq) this).field_l = param1;
        ((tq) this).field_f = true;
        ((tq) this).field_m = param2;
        mla var8 = this.a(param0, -30327, param2, param3);
        int var7 = param2.a(param3);
        var8.field_a[0] = param4 + -(var7 >> -1282732351);
        var8.field_a[param3.length()] = (var7 >> 1655301057) + param4;
        jia.a(param2, var8, 0, (byte) -75, param3);
    }

    final void a(po param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mla var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mla stackIn_33_0 = null;
        mla stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        mla stackIn_34_0 = null;
        mla stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        mla stackIn_35_0 = null;
        mla stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        po stackIn_37_0 = null;
        mla stackIn_37_1 = null;
        po stackIn_38_0 = null;
        mla stackIn_38_1 = null;
        po stackIn_39_0 = null;
        mla stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        mla stackOut_32_0 = null;
        mla stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        mla stackOut_34_0 = null;
        mla stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        mla stackOut_33_0 = null;
        mla stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        po stackOut_36_0 = null;
        mla stackOut_36_1 = null;
        po stackOut_38_0 = null;
        mla stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        po stackOut_37_0 = null;
        mla stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        L0: {
          var15 = BachelorFridge.field_y;
          if (-1 == (param1 ^ -1)) {
            param1 = param0.field_F;
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 != null) {
          if (param3 > 40) {
            L1: {
              if (param0 != ((tq) this).field_m) {
                break L1;
              } else {
                if (((tq) this).field_f) {
                  break L1;
                } else {
                  if (((tq) this).field_l != param5) {
                    break L1;
                  } else {
                    if (((tq) this).field_i != param2) {
                      break L1;
                    } else {
                      if (param1 != ((tq) this).field_k) {
                        break L1;
                      } else {
                        if (param6 != ((tq) this).field_o) {
                          break L1;
                        } else {
                          if (((tq) this).field_p != param7) {
                            break L1;
                          } else {
                            if (null == ((tq) this).field_j) {
                              break L1;
                            } else {
                              if (((tq) this).field_j.equals((Object) (Object) param4)) {
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
              ((tq) this).field_j = param4;
              ((tq) this).field_i = param2;
              ((tq) this).field_f = false;
              ((tq) this).field_m = param0;
              ((tq) this).field_o = param6;
              ((tq) this).field_l = param5;
              ((tq) this).field_p = param7;
              ((tq) this).field_k = param1;
              var16 = new String[param0.b(param4, param7) - -1];
              var17 = var16;
              var10 = Math.max(1, param0.a(param4, new int[1], var17));
              if (-4 != (((tq) this).field_i ^ -1)) {
                break L2;
              } else {
                if (1 != var10) {
                  break L2;
                } else {
                  ((tq) this).field_i = 1;
                  break L2;
                }
              }
            }
            L3: {
              ((tq) this).field_a = new mla[var10];
              if (0 != ((tq) this).field_i) {
                if (1 == ((tq) this).field_i) {
                  var11 = (-(((tq) this).field_k * var10) + ((tq) this).field_o >> 621887329) + param0.field_u;
                  break L3;
                } else {
                  if (((tq) this).field_i != 2) {
                    L4: {
                      var12 = (-(((tq) this).field_k * var10) + ((tq) this).field_o) / (1 + var10);
                      if (var12 >= 0) {
                        break L4;
                      } else {
                        var12 = 0;
                        break L4;
                      }
                    }
                    var11 = var12 + param0.field_u;
                    ((tq) this).field_k = ((tq) this).field_k + var12;
                    break L3;
                  } else {
                    var11 = -(((tq) this).field_k * var10) + -param0.field_B + ((tq) this).field_o;
                    break L3;
                  }
                }
              } else {
                var11 = param0.field_u;
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
                  stackOut_32_2 = var11 - param0.field_u;
                  stackOut_32_3 = param0.field_B + var11;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  if (var13 == null) {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = 0;
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
                    stackOut_33_4 = var13.length();
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_35_4 = stackOut_33_4;
                    break L6;
                  }
                }
                L7: {
                  new mla(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                  var14 = (mla) (Object) stackIn_35_0;
                  var14.field_a[0] = 0;
                  if (var13 == null) {
                    break L7;
                  } else {
                    L8: {
                      var14.field_a[var13.length()] = param0.a(var13);
                      stackOut_36_0 = (po) param0;
                      stackOut_36_1 = (mla) var14;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if ((param5 ^ -1) != -4) {
                        stackOut_38_0 = (po) (Object) stackIn_38_0;
                        stackOut_38_1 = (mla) (Object) stackIn_38_1;
                        stackOut_38_2 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        break L8;
                      } else {
                        stackOut_37_0 = (po) (Object) stackIn_37_0;
                        stackOut_37_1 = (mla) (Object) stackIn_37_1;
                        stackOut_37_2 = ((tq) this).a(-1, var13, param0.a(var13), param7);
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        break L8;
                      }
                    }
                    jia.a((po) (Object) stackIn_39_0, (mla) (Object) stackIn_39_1, stackIn_39_2, (byte) -96, var13);
                    break L7;
                  }
                }
                var11 = var11 + param1;
                ((tq) this).field_a[var12] = var14;
                var12++;
                continue L5;
              }
            }
          } else {
            return;
          }
        } else {
          ((tq) this).field_a = null;
          return;
        }
    }

    private final mla a(int param0, int param1, po param2, String param3) {
        mla var6 = new mla(param0 - param2.field_u, param2.field_B + param0, param3.length());
        mla var5 = var6;
        ((tq) this).field_a = new mla[]{var6};
        if (param1 != -30327) {
            ((tq) this).field_k = -62;
        }
        return var5;
    }

    final void a(int param0, String param1, po param2, int param3, int param4) {
        if (param1 == null) {
            ((tq) this).field_a = null;
            return;
        }
        if (((tq) this).field_m == param2) {
            if (((tq) this).field_f) {
                if (-1 == (((tq) this).field_l ^ -1)) {
                    if (null != ((tq) this).field_j) {
                        if (!(!((tq) this).field_j.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((tq) this).field_f = true;
        ((tq) this).field_m = param2;
        ((tq) this).field_j = param1;
        ((tq) this).field_l = 0;
        mla var7 = this.a(param3, param0 ^ -30327, param2, param1);
        mla var8 = var7;
        var7.field_a[0] = param4;
        var8.field_a[param1.length()] = param4 - -param2.a(param1);
        jia.a(param2, var8, param0, (byte) -109, param1);
    }

    public static void c(int param0) {
        if (param0 != -15298) {
            return;
        }
        field_g = null;
        field_n = null;
    }

    public tq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Log in";
    }
}
