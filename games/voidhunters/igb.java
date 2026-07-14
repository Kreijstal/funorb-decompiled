/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class igb {
    static java.awt.Canvas field_a;
    static String field_b;

    final static String a(CharSequence param0, byte param1) {
        if (param1 <= 111) {
            igb.a(-66);
            return dk.a(-125, false, param0);
        }
        return dk.a(-125, false, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, double param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (r.field_l != param1) {
            var3 = 0;
            L1: while (true) {
              if (-257 >= (var3 ^ -1)) {
                r.field_l = param1;
                break L0;
              } else {
                L2: {
                  var4 = (int)(255.0 * Math.pow((double)var3 / 255.0, param1));
                  stackOut_4_0 = pp.field_o;
                  stackOut_4_1 = var3;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (255 < var4) {
                    stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 255;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L2;
                  } else {
                    stackOut_5_0 = (int[]) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = var4;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    break L2;
                  }
                }
                stackIn_7_0[stackIn_7_1] = stackIn_7_2;
                var3++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (!param0) {
          igb.a(false, 0.7064342118398381);
          return;
        } else {
          return;
        }
    }

    final static void a(llb param0, byte param1) {
        llb var2 = null;
        int var3 = 0;
        llb var4 = null;
        llb var5 = null;
        llb var5_ref = null;
        var3 = VoidHunters.field_G;
        var4 = (llb) (Object) param0.field_lb.d(0);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            param0.field_K = 0;
            param0.field_db = 0;
            if (param1 >= -22) {
              field_b = null;
              param0.field_E = 0;
              param0.field_G = 0;
              return;
            } else {
              param0.field_E = 0;
              param0.field_G = 0;
              return;
            }
          } else {
            var4.field_K = 0;
            var4.field_G = 0;
            var4.field_db = 0;
            var4.field_E = 0;
            var5 = (llb) (Object) param0.field_lb.a((byte) 108);
            var5_ref = var5;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Limited time only";
    }
}
