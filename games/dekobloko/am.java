/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_d;
    static ke field_a;
    static String field_b;
    static boolean field_c;

    final static kc a(int param0, boolean param1, int param2, int param3, int param4) {
        kc var5 = null;
        kc var5_ref = null;
        int var6 = 0;
        kc var7 = null;
        kc var8 = null;
        kc var9 = null;
        kc var10 = null;
        kc var11 = null;
        vj stackIn_7_0 = null;
        vj stackIn_8_0 = null;
        vj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        vj stackIn_17_0 = null;
        vj stackIn_18_0 = null;
        vj stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        vj stackOut_16_0 = null;
        vj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        vj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        vj stackOut_6_0 = null;
        vj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var6 = client.field_A ? 1 : 0;
        if (!param1) {
          var10 = (kc) (Object) dg.field_e.c((byte) 49);
          var7 = var10;
          var5 = (kc) (Object) dg.field_e.c((byte) 49);
          L0: while (true) {
            if (var7 != null) {
              if (param3 != var10.field_n) {
                L1: {
                  stackOut_16_0 = dg.field_e;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (param1) {
                    stackOut_18_0 = (vj) (Object) stackIn_18_0;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L1;
                  } else {
                    stackOut_17_0 = (vj) (Object) stackIn_17_0;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L1;
                  }
                }
                var5_ref = (kc) (Object) ((vj) (Object) stackIn_19_0).d(stackIn_19_1 != 0);
                continue L0;
              } else {
                return var7;
              }
            } else {
              var11 = new kc();
              var11.field_n = param3;
              var11.field_o = param4;
              var11.field_v = param2;
              dg.field_e.a((bh) (Object) var11, 2777);
              wb.a(var11, param0, 60);
              return var11;
            }
          }
        } else {
          kc discarded$1 = am.a(9, false, 66, -99, 40);
          var8 = (kc) (Object) dg.field_e.c((byte) 49);
          var7 = var8;
          var5 = (kc) (Object) dg.field_e.c((byte) 49);
          L2: while (true) {
            if (var7 != null) {
              if (param3 != var8.field_n) {
                L3: {
                  stackOut_6_0 = dg.field_e;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (param1) {
                    stackOut_8_0 = (vj) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = (vj) (Object) stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                var5_ref = (kc) (Object) ((vj) (Object) stackIn_9_0).d(stackIn_9_1 != 0);
                continue L2;
              } else {
                return var7;
              }
            } else {
              var9 = new kc();
              var9.field_n = param3;
              var9.field_o = param4;
              var9.field_v = param2;
              dg.field_e.a((bh) (Object) var9, 2777);
              wb.a(var9, param0, 60);
              return var9;
            }
          }
        }
    }

    final static int b(int param0) {
        if (param0 <= 69) {
          int discarded$2 = am.b(-17);
          return wl.field_o + (wh.field_d << -19637598) + (qk.field_i << -1631507260);
        } else {
          return wl.field_o + (wh.field_d << -19637598) + (qk.field_i << -1631507260);
        }
    }

    public static void a(int param0) {
        if (param0 < 77) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_b = "The following settings need to be changed:  ";
    }
}
