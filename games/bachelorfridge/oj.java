/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends k {
    static String field_m;
    private int field_p;
    private int field_q;
    private int field_l;
    static String field_o;
    private int field_k;
    static String field_n;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = BachelorFridge.field_y;
        if (param2 >= 76) {
          param7--;
          L0: while (true) {
            if (param7 >= 0) {
              var19 = param4;
              var17 = var19;
              var10 = var17;
              var11 = param3;
              var12 = param0;
              var13 = param6;
              var14 = param5;
              var15 = (var19[var11] & 16711422) >> 758518785;
              var10[var11] = (dda.a(33493156, var14) >> -297516463) + dda.a(65280, var13 >> 1632610249) + dda.a(var12 >> -1182361183, 16711680) + var15;
              param5 = param5 + param9;
              param6 = param6 + param8;
              param0 = param0 + param1;
              param3++;
              param7--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          oj.e((byte) -89);
          param7--;
          L1: while (true) {
            if (param7 >= 0) {
              var18 = param4;
              var17 = var18;
              var10 = var17;
              var11 = param3;
              var12 = param0;
              var13 = param6;
              var14 = param5;
              var15 = (var18[var11] & 16711422) >> 758518785;
              var10[var11] = (dda.a(33493156, var14) >> -297516463) + dda.a(65280, var13 >> 1632610249) + dda.a(var12 >> -1182361183, 16711680) + var15;
              param5 = param5 + param9;
              param6 = param6 + param8;
              param0 = param0 + param1;
              param3++;
              param7--;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
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
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        var14 = BachelorFridge.field_y;
        if (param1 == 0) {
          var15 = ((oj) this).field_j.a(param0, param1 ^ -1);
          var3 = var15;
          if (!((oj) this).field_j.field_m) {
            return var15;
          } else {
            var4 = 0;
            L0: while (true) {
              if (hh.field_d <= var4) {
                return var15;
              } else {
                var5 = (jq.field_k[var4] << 875587756) / ((oj) this).field_l + ((oj) this).field_p;
                var6 = (tj.field_f[param0] << -1024830228) / ((oj) this).field_l - -((oj) this).field_q;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> -508288820;
                var12 = var6 * var6 >> -1958729172;
                var13 = 0;
                L1: while (true) {
                  L2: {
                    if (16384 <= var12 + var11) {
                      break L2;
                    } else {
                      if (var13 >= ((oj) this).field_k) {
                        break L2;
                      } else {
                        var10 = var8 + (var9 * var10 >> 2058377644) * 2;
                        var9 = -var12 + var11 + var7;
                        var11 = var9 * var9 >> 1110495884;
                        var12 = var10 * var10 >> -1133600084;
                        var13++;
                        continue L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_9_0 = (int[]) var15;
                    stackOut_9_1 = var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var13 >= -1 + ((oj) this).field_k) {
                      stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L3;
                    } else {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (var13 << 200154284) / ((oj) this).field_k;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L3;
                    }
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public oj() {
        super(0, true);
        ((oj) this).field_q = 0;
        ((oj) this).field_p = 0;
        ((oj) this).field_l = 1365;
        ((oj) this).field_k = 20;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var4 = param2;
        if (-1 == (var4 ^ -1)) {
          ((oj) this).field_l = param1.e((byte) 90);
          if (param0 == -71) {
            return;
          } else {
            field_n = null;
            return;
          }
        } else {
          if (var4 != 1) {
            if (2 != var4) {
              if ((var4 ^ -1) != -4) {
                if (param0 == -71) {
                  return;
                } else {
                  field_n = null;
                  return;
                }
              } else {
                ((oj) this).field_q = param1.e((byte) 57);
                if (param0 == -71) {
                  return;
                } else {
                  field_n = null;
                  return;
                }
              }
            } else {
              ((oj) this).field_p = param1.e((byte) 119);
              if (param0 == -71) {
                return;
              } else {
                field_n = null;
                return;
              }
            }
          } else {
            ((oj) this).field_k = param1.e((byte) 114);
            if (param0 == -71) {
              return;
            } else {
              field_n = null;
              return;
            }
          }
        }
    }

    public static void e(byte param0) {
        if (param0 > -114) {
          oj.e((byte) 62);
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        } else {
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Drinks";
        field_n = "Remove <%0> from ignore list";
        field_o = "Bakery";
    }
}
