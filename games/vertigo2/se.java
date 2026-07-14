/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ji {
    static er field_C;
    static byte[][] field_y;
    private int field_z;
    static fi field_A;

    final int[] c(int param0, int param1) {
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
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var16 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var17 = ((se) this).field_x.a(param0, (byte) -62);
            var3 = var17;
            if (((se) this).field_x.field_i) {
              var25 = ((se) this).a(0, -1, param0 - 1 & fk.field_x);
              var5 = ((se) this).a(0, -1, param0);
              var24 = ((se) this).a(0, -1, param0 + 1 & fk.field_x);
              var7 = 0;
              L1: while (true) {
                if (var7 >= we.field_M) {
                  break L0;
                } else {
                  L2: {
                    var8 = ((se) this).field_z * (var24[var7] + -var25[var7]);
                    var9 = (-var5[rm.field_z & var7 + -1] + var5[rm.field_z & 1 + var7]) * ((se) this).field_z;
                    var10 = var9 >> -1282808212;
                    var11 = var8 >> -236894004;
                    var12 = var10 * var10 >> 1053475500;
                    var13 = var11 * var11 >> -1399981012;
                    var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + (var12 + 4096)) / 4096.0f)));
                    if (0 == var14) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 16777216 / var14;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  var15 = stackIn_9_0;
                  var17[var7] = -var15 + 4096;
                  var7++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return var17;
        } else {
          return null;
        }
    }

    final static void a(String param0, int param1) {
        lr.field_S = param0;
        rh.b(param1 + -26, param1);
    }

    public se() {
        super(1, true);
        ((se) this).field_z = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        if (0 == param1) {
            ((se) this).field_z = param2.a((byte) -11);
        }
        if (param0 != 110) {
            Object var5 = null;
            ((se) this).a((byte) -52, -60, (ed) null);
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_y = null;
        field_C = null;
        field_A = null;
    }

    static {
    }
}
