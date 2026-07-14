/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends tb {
    private int field_i;
    private int field_j;
    private String field_n;
    private int field_o;
    private boolean field_m;
    private int field_l;
    private vc field_p;
    private int field_k;

    final void a(byte param0, String param1, vc param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bh var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        bh stackIn_33_0 = null;
        bh stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        bh stackIn_34_0 = null;
        bh stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        bh stackIn_35_0 = null;
        bh stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        bh stackIn_38_0 = null;
        bh stackIn_39_0 = null;
        bh stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        bh stackOut_32_0 = null;
        bh stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        bh stackOut_34_0 = null;
        bh stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        bh stackOut_33_0 = null;
        bh stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        bh stackOut_37_0 = null;
        bh stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        bh stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var15 = CrazyCrystals.field_B;
          if (0 != param7) {
            break L0;
          } else {
            param7 = param2.field_y;
            break L0;
          }
        }
        if (param1 == null) {
          ((po) this).field_h = null;
          return;
        } else {
          L1: {
            if (param2 != ((po) this).field_p) {
              break L1;
            } else {
              if (((po) this).field_m) {
                break L1;
              } else {
                if (param6 != ((po) this).field_k) {
                  break L1;
                } else {
                  if (((po) this).field_j != param3) {
                    break L1;
                  } else {
                    if (param7 != ((po) this).field_l) {
                      break L1;
                    } else {
                      if (((po) this).field_i != param4) {
                        break L1;
                      } else {
                        if (param5 != ((po) this).field_o) {
                          break L1;
                        } else {
                          if (((po) this).field_n == null) {
                            break L1;
                          } else {
                            if (((po) this).field_n.equals((Object) (Object) param1)) {
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
            ((po) this).field_p = param2;
            ((po) this).field_i = param4;
            ((po) this).field_n = param1;
            ((po) this).field_j = param3;
            ((po) this).field_o = param5;
            ((po) this).field_k = param6;
            if (param0 == 28) {
              break L2;
            } else {
              ((po) this).field_i = 24;
              break L2;
            }
          }
          L3: {
            ((po) this).field_m = false;
            ((po) this).field_l = param7;
            var16 = new String[param2.a(param1, param5) - -1];
            var17 = var16;
            var10 = Math.max(1, param2.a(param1, new int[1], var17));
            if (-4 != ((po) this).field_j) {
              break L3;
            } else {
              if (-2 != var10) {
                break L3;
              } else {
                ((po) this).field_j = 1;
                break L3;
              }
            }
          }
          L4: {
            if (0 == ((po) this).field_j) {
              var11 = param2.field_o;
              break L4;
            } else {
              if (-2 == (((po) this).field_j ^ -1)) {
                var11 = param2.field_o + (((po) this).field_i + -(var10 * ((po) this).field_l) >> 241330401);
                break L4;
              } else {
                if (2 == ((po) this).field_j) {
                  var11 = ((po) this).field_i + (-param2.field_u + -(var10 * ((po) this).field_l));
                  break L4;
                } else {
                  L5: {
                    var12 = (-(((po) this).field_l * var10) + ((po) this).field_i) / (1 + var10);
                    if (0 <= var12) {
                      break L5;
                    } else {
                      var12 = 0;
                      break L5;
                    }
                  }
                  var11 = var12 + param2.field_o;
                  ((po) this).field_l = ((po) this).field_l + var12;
                  break L4;
                }
              }
            }
          }
          ((po) this).field_h = new bh[var10];
          var12 = 0;
          L6: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L7: {
                var13 = var16[var12];
                stackOut_32_0 = null;
                stackOut_32_1 = null;
                stackOut_32_2 = -param2.field_o + var11;
                stackOut_32_3 = var11 - -param2.field_u;
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
                  break L7;
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
                  break L7;
                }
              }
              L8: {
                new bh(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                var14 = stackIn_35_0;
                var14.field_e[0] = 0;
                if (var13 != null) {
                  L9: {
                    var14.field_e[var13.length()] = param2.a(var13);
                    stackOut_37_0 = (bh) var14;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (-4 == (param6 ^ -1)) {
                      stackOut_39_0 = (bh) (Object) stackIn_39_0;
                      stackOut_39_1 = ((po) this).a((byte) 79, param5, var13, param2.a(var13));
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L9;
                    } else {
                      stackOut_38_0 = (bh) (Object) stackIn_38_0;
                      stackOut_38_1 = 0;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      break L9;
                    }
                  }
                  te.a(stackIn_40_0, stackIn_40_1, var13, (byte) -95, param2);
                  break L8;
                } else {
                  break L8;
                }
              }
              ((po) this).field_h[var12] = var14;
              var11 = var11 + param7;
              var12++;
              continue L6;
            }
          }
        }
    }

    final void a(String param0, vc param1, int param2, int param3, boolean param4) {
        if (!(param0 != null)) {
            ((po) this).field_h = null;
            return;
        }
        if (((po) this).field_p == param1) {
            if (((po) this).field_m) {
                if ((((po) this).field_k ^ -1) == -2) {
                    if (((po) this).field_n != null) {
                        if (!(!((po) this).field_n.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_k = 1;
        ((po) this).field_m = true;
        ((po) this).field_p = param1;
        bh var8 = this.a(param1, param0, param3, (byte) 13);
        int var7 = param1.a(param0);
        if (param4) {
            ((po) this).field_m = true;
        }
        var8.field_e[0] = param2 - (var7 >> 1472485633);
        var8.field_e[param0.length()] = param2 - -(var7 >> -1103898463);
        te.a(var8, 0, param0, (byte) -95, param1);
    }

    final void a(byte param0, String param1, int param2, int param3, vc param4) {
        if (!(param1 != null)) {
            ((po) this).field_h = null;
            return;
        }
        if (param4 == ((po) this).field_p) {
            if (((po) this).field_m) {
                if (((po) this).field_k == 2) {
                    if (((po) this).field_n != null) {
                        if (!(!((po) this).field_n.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_n = param1;
        ((po) this).field_k = 2;
        if (param0 < 95) {
            Object var7 = null;
            ((po) this).a(-121, (String) null, 97, 102, (vc) null);
        }
        ((po) this).field_m = true;
        ((po) this).field_p = param4;
        bh var9 = this.a(param4, param1, param3, (byte) 13);
        bh var10 = var9;
        var10.field_e[0] = -param4.a(param1) + param2;
        var10.field_e[param1.length()] = param2;
        te.a(var10, 0, param1, (byte) -95, param4);
    }

    private final bh a(vc param0, String param1, int param2, byte param3) {
        bh var7 = new bh(-param0.field_o + param2, param2 + param0.field_u, param1.length());
        bh var5 = var7;
        ((po) this).field_h = new bh[]{var7};
        if (param3 != 13) {
            Object var6 = null;
            ((po) this).a((byte) 12, (String) null, -102, 101, (vc) null);
        }
        return var5;
    }

    final void a(int param0, String param1, int param2, int param3, vc param4) {
        if (!(param1 != null)) {
            ((po) this).field_h = null;
            return;
        }
        if (param4 == ((po) this).field_p) {
            if (((po) this).field_m) {
                if (((po) this).field_k == 0) {
                    if (((po) this).field_n != null) {
                        if (((po) this).field_n.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((po) this).field_m = true;
        ((po) this).field_n = param1;
        ((po) this).field_k = param2;
        ((po) this).field_p = param4;
        bh var7 = this.a(param4, param1, param0, (byte) 13);
        bh var8 = var7;
        var7.field_e[0] = param3;
        var8.field_e[param1.length()] = param4.a(param1) + param3;
        te.a(var8, 0, param1, (byte) -95, param4);
    }

    public po() {
    }

    static {
    }
}
