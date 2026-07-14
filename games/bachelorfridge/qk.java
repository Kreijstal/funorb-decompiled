/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends k {
    private int field_o;
    static int field_l;
    static String field_n;
    static sna field_q;
    static String field_p;
    static String field_k;
    static int[] field_m;

    public static void d(int param0) {
        field_q = null;
        if (param0 < 66) {
            return;
        }
        field_m = null;
        field_k = null;
        field_p = null;
        field_n = null;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var16 = BachelorFridge.field_y;
        if (param1 == 0) {
          var17 = ((qk) this).field_j.a(param0, -1);
          var3 = var17;
          if (!((qk) this).field_j.field_m) {
            return var17;
          } else {
            var20 = ((qk) this).a(0, -1 + param0 & it.field_r, (byte) 105);
            var5 = ((qk) this).a(0, param0, (byte) 116);
            var21 = ((qk) this).a(0, param0 + 1 & it.field_r, (byte) 109);
            var7 = 0;
            L0: while (true) {
              if (hh.field_d <= var7) {
                return var17;
              } else {
                L1: {
                  var8 = ((qk) this).field_o * (-var20[var7] + var21[var7]);
                  var9 = (-var5[-1 + var7 & wp.field_r] + var5[1 + var7 & wp.field_r]) * ((qk) this).field_o;
                  var10 = var9 >> 2133613836;
                  var11 = var8 >> 1835324652;
                  var12 = var10 * var10 >> 345903020;
                  var13 = var11 * var11 >> -153846100;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var12 + var13)) / 4096.0f)));
                  if (-1 == (var14 ^ -1)) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L1;
                  } else {
                    stackOut_15_0 = 16777216 / var14;
                    stackIn_17_0 = stackOut_15_0;
                    break L1;
                  }
                }
                var15 = stackIn_17_0;
                var17[var7] = -var15 + 4096;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          field_n = null;
          var17 = ((qk) this).field_j.a(param0, -1);
          var3 = var17;
          if (!((qk) this).field_j.field_m) {
            return var17;
          } else {
            var20 = ((qk) this).a(0, -1 + param0 & it.field_r, (byte) 105);
            var5 = ((qk) this).a(0, param0, (byte) 116);
            var21 = ((qk) this).a(0, param0 + 1 & it.field_r, (byte) 109);
            var7 = 0;
            L2: while (true) {
              if (hh.field_d <= var7) {
                return var17;
              } else {
                L3: {
                  var8 = ((qk) this).field_o * (-var20[var7] + var21[var7]);
                  var9 = (-var5[-1 + var7 & wp.field_r] + var5[1 + var7 & wp.field_r]) * ((qk) this).field_o;
                  var10 = var9 >> 2133613836;
                  var11 = var8 >> 1835324652;
                  var12 = var10 * var10 >> 345903020;
                  var13 = var11 * var11 >> -153846100;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var12 + var13)) / 4096.0f)));
                  if (-1 == (var14 ^ -1)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 16777216 / var14;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                var15 = stackIn_7_0;
                var17[var7] = -var15 + 4096;
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    public qk() {
        super(1, true);
        ((qk) this).field_o = 4096;
    }

    final void a(byte param0, lu param1, int param2) {
        if (param0 == -71) {
          if (param2 == 0) {
            ((qk) this).field_o = param1.e((byte) 47);
            return;
          } else {
            return;
          }
        } else {
          field_m = null;
          if (param2 != 0) {
            return;
          } else {
            ((qk) this).field_o = param1.e((byte) 47);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Please select an option in the '<%0>' row.";
        field_k = "Bachelor Fridge";
    }
}
