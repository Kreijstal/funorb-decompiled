/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends le {
    static String field_i;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        if (param1 > -60) {
            field_i = null;
        }
        if (!(0 != param0)) {
            ((hk) this).field_j = param2.e(1869);
        }
    }

    final int[] a(int param0, boolean param1) {
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
        var16 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var17 = ((hk) this).field_f.a((byte) 124, param0);
            var3 = var17;
            if (((hk) this).field_f.field_e) {
              var25 = ((hk) this).a(0, wf.field_d & -1 + param0, 255);
              var5 = ((hk) this).a(0, param0, 255);
              var24 = ((hk) this).a(0, wf.field_d & param0 - -1, 255);
              var7 = 0;
              L1: while (true) {
                if (var7 >= hob.field_d) {
                  break L0;
                } else {
                  L2: {
                    var8 = ((hk) this).field_j * (var24[var7] - var25[var7]);
                    var9 = (-var5[gbb.field_q & -1 + var7] + var5[var7 - -1 & gbb.field_q]) * ((hk) this).field_j;
                    var10 = var9 >> -1225116564;
                    var11 = var8 >> 1949747916;
                    var12 = var10 * var10 >> -692120020;
                    var13 = var11 * var11 >> -1210841460;
                    var14 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var13 + var12)) / 4096.0f)));
                    if (var14 != 0) {
                      stackOut_8_0 = 16777216 / var14;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  var15 = stackIn_9_0;
                  var17[var7] = 4096 + -var15;
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

    final static void b(int param0, int param1) {
        nrb.field_b = new pgb[param0 * 15];
        if (param1 > -90) {
            field_i = null;
        }
        ou.field_q = 0;
        dca.field_q = new int[3];
        hab.field_k = param0;
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != -1210841460) {
            field_i = null;
        }
    }

    public hk() {
        super(1, true);
        ((hk) this).field_j = 4096;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Enter name of friend to add to list";
    }
}
