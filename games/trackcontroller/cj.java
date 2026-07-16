/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends rb {
    private int field_f;
    private int field_m;
    private int field_g;
    static le field_e;
    private int field_i;
    private boolean field_l;
    private oh field_n;
    static ja field_j;
    private int field_h;
    private String field_k;
    static lj field_o;

    private final va a(oh param0, int param1, String param2, int param3) {
        va var7 = new va(param3 + -param0.field_G, param3 - -param0.field_u, param2.length());
        va var5 = var7;
        int var6 = -63 % ((param1 - 45) / 59);
        ((cj) this).field_b = new va[]{var7};
        return var5;
    }

    final void a(int param0, String param1, int param2, oh param3, int param4) {
        if (param1 == null) {
            ((cj) this).field_b = null;
            return;
        }
        if (param3 == ((cj) this).field_n) {
            if (((cj) this).field_l) {
                if (2 == ((cj) this).field_m) {
                    if (((cj) this).field_k != null) {
                        if (((cj) this).field_k.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((cj) this).field_n = param3;
        ((cj) this).field_l = true;
        ((cj) this).field_m = 2;
        ((cj) this).field_k = param1;
        if (param0 != -19121) {
            ((cj) this).field_l = false;
        }
        va var8 = this.a(param3, 115, param1, param2);
        va var9 = var8;
        var9.field_b[0] = param4 - param3.a(param1);
        var9.field_b[param1.length()] = param4;
        id.a((byte) -119, 0, param3, param1, var9);
    }

    public static void e(int param0) {
        if (param0 != 4) {
            return;
        }
        field_j = null;
        field_o = null;
        field_e = null;
    }

    final void a(oh param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        va var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        va stackIn_34_0 = null;
        va stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        va stackIn_35_0 = null;
        va stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        va stackIn_36_0 = null;
        va stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        va stackOut_33_0 = null;
        va stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        va stackOut_35_0 = null;
        va stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        va stackOut_34_0 = null;
        va stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        L0: {
          var15 = TrackController.field_F ? 1 : 0;
          if (0 == param4) {
            param4 = param0.field_q;
            break L0;
          } else {
            break L0;
          }
        }
        if (param6 == null) {
          ((cj) this).field_b = null;
          return;
        } else {
          L1: {
            if (((cj) this).field_n != param0) {
              break L1;
            } else {
              if (((cj) this).field_l) {
                break L1;
              } else {
                if ((param2 ^ -1) != (((cj) this).field_m ^ -1)) {
                  break L1;
                } else {
                  if (param7 != ((cj) this).field_f) {
                    break L1;
                  } else {
                    if (param4 != ((cj) this).field_g) {
                      break L1;
                    } else {
                      if ((param3 ^ -1) != (((cj) this).field_h ^ -1)) {
                        break L1;
                      } else {
                        if ((((cj) this).field_i ^ -1) != (param5 ^ -1)) {
                          break L1;
                        } else {
                          if (((cj) this).field_k == null) {
                            break L1;
                          } else {
                            if (((cj) this).field_k.equals((Object) (Object) param6)) {
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
            ((cj) this).field_k = param6;
            ((cj) this).field_l = false;
            ((cj) this).field_h = param3;
            ((cj) this).field_i = param5;
            ((cj) this).field_g = param4;
            if (param1 > 40) {
              break L2;
            } else {
              ((cj) this).field_h = -116;
              break L2;
            }
          }
          L3: {
            ((cj) this).field_n = param0;
            ((cj) this).field_m = param2;
            ((cj) this).field_f = param7;
            var16 = new String[param0.b(param6, param5) + 1];
            var17 = var16;
            var10 = Math.max(1, param0.a(param6, new int[1], var17));
            if ((((cj) this).field_f ^ -1) != -4) {
              break L3;
            } else {
              if (-2 != (var10 ^ -1)) {
                break L3;
              } else {
                ((cj) this).field_f = 1;
                break L3;
              }
            }
          }
          L4: {
            ((cj) this).field_b = new va[var10];
            if (-1 == (((cj) this).field_f ^ -1)) {
              var11 = param0.field_G;
              break L4;
            } else {
              if (((cj) this).field_f != 1) {
                if (-3 == (((cj) this).field_f ^ -1)) {
                  var11 = -(((cj) this).field_g * var10) + -param0.field_u + ((cj) this).field_h;
                  break L4;
                } else {
                  L5: {
                    var12 = (-(var10 * ((cj) this).field_g) + ((cj) this).field_h) / (var10 - -1);
                    if (-1 >= (var12 ^ -1)) {
                      break L5;
                    } else {
                      var12 = 0;
                      break L5;
                    }
                  }
                  ((cj) this).field_g = ((cj) this).field_g + var12;
                  var11 = param0.field_G - -var12;
                  break L4;
                }
              } else {
                var11 = param0.field_G - -(-(((cj) this).field_g * var10) + ((cj) this).field_h >> -1533215743);
                break L4;
              }
            }
          }
          var12 = 0;
          L6: while (true) {
            if (var10 <= var12) {
              return;
            } else {
              L7: {
                var13 = var16[var12];
                stackOut_33_0 = null;
                stackOut_33_1 = null;
                stackOut_33_2 = -param0.field_G + var11;
                stackOut_33_3 = param0.field_u + var11;
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
                  break L7;
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
                  break L7;
                }
              }
              L8: {
                var14 = new va(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                var14.field_b[0] = 0;
                if (var13 != null) {
                  L9: {
                    var14.field_b[var13.length()] = param0.a(var13);
                    stackOut_38_0 = -123;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_39_0 = stackOut_38_0;
                    if ((param2 ^ -1) != -4) {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      break L9;
                    } else {
                      stackOut_39_0 = stackIn_39_0;
                      stackOut_39_1 = ((cj) this).a(param0.a(var13), var13, 5, param5);
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      break L9;
                    }
                  }
                  id.a((byte) stackIn_41_0, stackIn_41_1, param0, var13, var14);
                  break L8;
                } else {
                  break L8;
                }
              }
              var11 = var11 + param4;
              ((cj) this).field_b[var12] = var14;
              var12++;
              continue L6;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        nk.field_l = param2;
        if (!param0) {
            cj.e(-89);
        }
        j.field_c = param1;
    }

    final static void a(int param0, boolean param1) {
        la var2 = ra.field_C;
        var2.c(param0, 7);
        var2.a(1, (byte) -104);
        var2.a(0, (byte) -88);
        if (param1) {
            field_e = null;
        }
    }

    final static void d(int param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        qj var1 = new qj(540, 140);
        mb.a((byte) 124, var1);
        ig.a();
        ll.a();
        fb.field_a = 0;
        be.a((byte) -108);
        qj var2 = var1.b();
        if (param0 <= 81) {
            field_e = null;
        }
        for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            ll.a(4, 4, 0, 0, 540, 140);
        }
        ha.field_E.a();
        var1.d(0, 0);
        ch.m(124);
    }

    public cj() {
    }

    final void a(int param0, int param1, oh param2, int param3, String param4) {
        if (param0 != 1888) {
            ((cj) this).field_g = -104;
        }
        if (param4 == null) {
            ((cj) this).field_b = null;
            return;
        }
        if (((cj) this).field_n == param2) {
            if (((cj) this).field_l) {
                if (-1 == (((cj) this).field_m ^ -1)) {
                    if (((cj) this).field_k != null) {
                        if (((cj) this).field_k.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((cj) this).field_l = true;
        ((cj) this).field_k = param4;
        ((cj) this).field_m = 0;
        ((cj) this).field_n = param2;
        va var7 = this.a(param2, -103, param4, param1);
        va var8 = var7;
        var7.field_b[0] = param3;
        var8.field_b[param4.length()] = param2.a(param4) + param3;
        id.a((byte) -121, 0, param2, param4, var8);
    }

    final void a(int param0, oh param1, String param2, int param3, int param4) {
        if (!(param2 != null)) {
            ((cj) this).field_b = null;
            return;
        }
        if (param1 == ((cj) this).field_n) {
            if (((cj) this).field_l) {
                if (((cj) this).field_m == 1) {
                    if (((cj) this).field_k != null) {
                        if (!(!((cj) this).field_k.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((cj) this).field_n = param1;
        if (param0 <= 73) {
            cj.a(false, -40, 22);
        }
        ((cj) this).field_m = 1;
        ((cj) this).field_l = true;
        va var8 = this.a(param1, 117, param2, param3);
        int var7 = param1.a(param2);
        var8.field_b[0] = param4 - (var7 >> -136395295);
        var8.field_b[param2.length()] = (var7 >> 598125825) + param4;
        id.a((byte) -125, 0, param1, param2, var8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new le();
        field_j = new ja();
        field_o = new lj();
    }
}
