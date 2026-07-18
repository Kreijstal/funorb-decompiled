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
              tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 1) << 4, param0 + (ac.field_m >> 1) << 4, ((sj) this).field_h * 65535 / ((sj) this).field_c, 1024);
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
                  var11 = var7 >>> 24;
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
                          var11 = var7 >>> 24;
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
                      qn.field_d[var5] = oe.c(var9, var8) >>> 8;
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
          tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 1) << 4, param0 + (ac.field_m >> 1) << 4, ((sj) this).field_h * 65535 / ((sj) this).field_c, 1024);
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
        if (!(param1 >= 0)) {
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
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var10_int = 111;
            var10_int = param9.g(-108, 2);
            if (0 != var10_int) {
              if (1 != var10_int) {
                if (var10_int == 2) {
                  L1: {
                    var11 = 0;
                    var12 = 8200;
                    if (0 > var11) {
                      stackOut_17_0 = var11 + -var12;
                      stackIn_18_0 = stackOut_17_0;
                      break L1;
                    } else {
                      stackOut_16_0 = var12 + var11;
                      stackIn_18_0 = stackOut_16_0;
                      break L1;
                    }
                  }
                  break L0;
                } else {
                  if (3 != var10_int) {
                    throw new IllegalStateException();
                  } else {
                    L2: {
                      var11 = wa.a(param9, 30, 1);
                      var12 = 532488;
                      if (var11 < 0) {
                        stackOut_12_0 = -var12 + var11;
                        stackIn_13_0 = stackOut_12_0;
                        break L2;
                      } else {
                        stackOut_11_0 = var11 + var12;
                        stackIn_13_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    return stackIn_13_0;
                  }
                }
              } else {
                L3: {
                  var11 = wa.a(param9, 14, 1);
                  var12 = 8;
                  if (var11 >= 0) {
                    stackOut_6_0 = var11 - -var12;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = -var12 + var11;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = wa.a(param9, 4, 1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var10;
            stackOut_19_1 = new StringBuilder().append("sj.D(").append(536870912).append(',').append(524288).append(',').append(-65).append(',').append(30).append(',').append(20).append(',').append(8192).append(',').append(8).append(',').append(14).append(',').append(4).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param9 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(int param0, p param1) {
        int var3 = 0;
        int var4 = 0;
        sn var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            wh.field_f = false;
            td.field_d = new sn[cr.field_W.length][];
            int var2_int = -93;
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
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sj.B(" + 126 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
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
            return;
          } else {
            L1: {
              var5 = var4 % cm.field_b - (cm.field_b >> 1);
              var6 = -(ac.field_m >> 1) + var4 / cm.field_b;
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
