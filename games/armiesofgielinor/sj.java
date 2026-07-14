/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    private int field_c;
    static wj field_a;
    int field_h;
    static String field_b;
    private int[] field_f;
    static String field_g;
    private boolean field_i;
    static int field_e;
    static int field_d;

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((sj) this).field_i) {
          var4 = 0;
          var5 = qn.field_l * param0 - -param1;
          var6 = qn.field_l + -cm.field_b;
          var12 = 0;
          L0: while (true) {
            if (ac.field_m <= var12) {
              tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 2024903585) << 1904174884, param0 + (ac.field_m >> 1648665153) << -1765359900, ((sj) this).field_h * 65535 / ((sj) this).field_c, 1024);
              if (param2 != 121) {
                ((sj) this).a(false, -122, (byte) -12);
                return;
              } else {
                return;
              }
            } else {
              var13 = 0;
              L1: while (true) {
                if (var13 >= cm.field_b) {
                  var12++;
                  var5 = var5 + var6;
                  continue L0;
                } else {
                  var7 = vg.field_q[0].field_B[var4];
                  var11 = var7 >>> -550106088;
                  if (0 != var11) {
                    if (var11 >= 255) {
                      L2: {
                        if (((sj) this).field_f[var4] > ((sj) this).field_h) {
                          break L2;
                        } else {
                          var7 = vg.field_q[1].field_B[var4];
                          break L2;
                        }
                      }
                      qn.field_d[var5] = var7;
                      var4++;
                      var13++;
                      var5++;
                      continue L1;
                    } else {
                      L3: {
                        if (((sj) this).field_h >= ((sj) this).field_f[var4]) {
                          var7 = vg.field_q[1].field_B[var4];
                          var11 = var7 >>> -1276099368;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8 = 16711935 & var7;
                      var9 = var7 & 65280;
                      var7 = 256 - var11;
                      var8 = var8 * var7;
                      var9 = var9 * var7;
                      var7 = qn.field_d[var5];
                      var10 = var7 & 16711935;
                      var10 = var10 * var11;
                      var9 = var9 + var9;
                      var8 = var8 + var10;
                      var8 = var8 & -16711936;
                      var9 = var9 & 16711680;
                      qn.field_d[var5] = oe.c(var9, var8) >>> 1113347688;
                      var4++;
                      var13++;
                      var5++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    var13++;
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          vg.field_q[0].g(param1, param0);
          tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 2024903585) << 1904174884, param0 + (ac.field_m >> 1648665153) << -1765359900, ((sj) this).field_h * 65535 / ((sj) this).field_c, 1024);
          if (param2 == 121) {
            return;
          } else {
            ((sj) this).a(false, -122, (byte) -12);
            return;
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        if (!((param1 ^ -1) <= -1)) {
            ((sj) this).field_h = 0;
            ((sj) this).field_i = true;
            return;
        }
        if (!(param1 <= ((sj) this).field_h)) {
            param1 = param1 - ((sj) this).field_c;
        }
        int var4 = 23 % ((param2 - 82) / 42);
        if (!(((sj) this).field_h <= param1)) {
            var5 = -param1 + ((sj) this).field_h;
            var6 = tp.b(-84) * 2;
            ((sj) this).field_h = ((sj) this).field_h - (var6 <= var5 ? var6 : var5);
        }
        if (!(0 <= ((sj) this).field_h)) {
            ((sj) this).field_i = param0 ? true : false;
            ((sj) this).field_h = ((sj) this).field_h + ((sj) this).field_c;
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, bv param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var10 = 111 / ((25 - param2) / 56);
        var10 = param9.g(-108, 2);
        if (0 != var10) {
          if (1 != var10) {
            if ((var10 ^ -1) != -3) {
              if (3 == var10) {
                L0: {
                  if (0 == param3) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = wa.a(param9, param3, 1);
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                L1: {
                  var11 = stackIn_26_0;
                  var12 = param5 + param1 + param6;
                  if (var11 < 0) {
                    stackOut_28_0 = -var12 + var11;
                    stackIn_29_0 = stackOut_28_0;
                    break L1;
                  } else {
                    stackOut_27_0 = var11 + var12;
                    stackIn_29_0 = stackOut_27_0;
                    break L1;
                  }
                }
                return stackIn_29_0;
              } else {
                throw new IllegalStateException();
              }
            } else {
              L2: {
                if (param4 != 0) {
                  stackOut_16_0 = wa.a(param9, param4, 1);
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              L3: {
                var11 = stackIn_17_0;
                var12 = param5 + param6;
                if (0 > var11) {
                  stackOut_19_0 = var11 + -var12;
                  stackIn_20_0 = stackOut_19_0;
                  break L3;
                } else {
                  stackOut_18_0 = var12 + var11;
                  stackIn_20_0 = stackOut_18_0;
                  break L3;
                }
              }
              return stackIn_20_0;
            }
          } else {
            L4: {
              if (0 != param7) {
                stackOut_8_0 = wa.a(param9, param7, 1);
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = 0;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            L5: {
              var11 = stackIn_9_0;
              var12 = param6;
              if (-1 >= (var11 ^ -1)) {
                stackOut_11_0 = var11 - -var12;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = -var12 + var11;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            return stackIn_12_0;
          }
        } else {
          L6: {
            if (param8 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L6;
            } else {
              stackOut_2_0 = wa.a(param9, param8, 1);
              stackIn_4_0 = stackOut_2_0;
              break L6;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void a(int param0, p param1) {
        int var3 = 0;
        int var4 = 0;
        sn var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        wh.field_f = false;
        td.field_d = new sn[cr.field_W.length][];
        int var2 = 93 / ((27 - param0) / 62);
        for (var3 = 0; cr.field_W.length > var3; var3++) {
            td.field_d[var3] = new sn[cr.field_W[var3].length];
            for (var4 = 0; cr.field_W[var3].length > var4; var4++) {
                var5 = param1.a(cr.field_W[var3][var4], (byte) -97, "");
                if (var5 == null) {
                    var5 = param1.a((byte) -127, "", cr.field_W[var3][var4]);
                }
                if (var5 != null) {
                }
                td.field_d[var3][var4] = var5;
            }
        }
        ke.a((byte) 90, param1);
        wh.field_f = true;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        if (param0 > -17) {
            field_b = null;
        }
    }

    sj(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ((sj) this).field_i = false;
        ((sj) this).field_c = param0;
        var2 = 2147483647;
        ((sj) this).field_f = new int[ac.field_m * cm.field_b];
        var3 = -2147483648;
        var4 = 0;
        L0: while (true) {
          if (ac.field_m * cm.field_b <= var4) {
          } else {
            L1: {
              var5 = var4 % cm.field_b - (cm.field_b >> -1354655903);
              var6 = -(ac.field_m >> -316584031) + var4 / cm.field_b;
              var7 = (((sj) this).field_c + -(int)(Math.atan2((double)(-var5), (double)var6) * (double)((sj) this).field_c / 3.141592653589793)) / 2;
              if (var3 >= var7) {
                break L1;
              } else {
                var3 = var7;
                break L1;
              }
            }
            ((sj) this).field_f[var4] = var7;
            if (var7 < var2) {
              var2 = var7;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You can only use equipment on your turn.";
        field_a = null;
        field_e = -1;
    }
}
