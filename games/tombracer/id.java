/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends ou {
    private int field_f;
    private boolean field_j;
    static String field_k;
    static String[] field_g;
    static nh[] field_h;
    static String field_i;

    id(int param0, int param1) {
        super(rga.b(26499, param0), param1);
        ((id) this).field_f = param0;
        ((id) this).field_j = ((id) this).field_f == pl.a((byte) 64) ? true : false;
    }

    final wea a(byte param0) {
        wea var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        wea var6 = null;
        wea stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        wea stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        wea stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        wea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        wea stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        wea stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        wea stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        wea stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var6 = new wea(((id) this).field_a);
          var2 = var6;
          var3 = ht.d(((id) this).field_f, true);
          if (param0 == 58) {
            break L0;
          } else {
            ((id) this).field_j = true;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((id) this).field_a) {
            return var2;
          } else {
            L2: {
              L3: {
                stackOut_4_0 = (wea) var6;
                stackOut_4_1 = var4;
                stackOut_4_2 = var3[var4];
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_7_2 = stackOut_4_2;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                if (((id) this).field_j) {
                  break L3;
                } else {
                  stackOut_5_0 = (wea) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (!((id) this).b((byte) -67)) {
                    break L3;
                  } else {
                    stackOut_6_0 = (wea) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (wea) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              break L2;
            }
            ((wea) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0, (byte) -36);
            var4++;
            continue L1;
          }
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_i = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"<%0> didn't see the light", "<%0> went into the light", "<%0> was hit by a laser", "<%0> was lasered", "<%0> crossed the beam", "<%0> suddenly remembers that fiery-coloured beams of death should be avoided"};
        field_k = "Tutorial";
        field_i = "Resigned";
    }
}
