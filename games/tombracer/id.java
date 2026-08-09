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
        this.field_f = param0;
        this.field_j = this.field_f == pl.a((byte) 64) ? true : false;
    }

    final wea a(byte param0) {
        wea var2;
        int[] var3;
        int var4;
        int var5;
        wea var6;
        wea stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        wea stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var6 = new wea(this.field_a);
          var2 = var6;
          var3 = ht.d(this.field_f, true);
          if (param0 == 58) {
            break L0;
          } else {
            this.field_j = true;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_a) {
            return var2;
          } else {
            L2: {
              L3: {
                stackIn_7_0 = (wea) (var6);

                stackIn_7_1 = var4;

                stackIn_7_2 = var3[var4];

                if (this.field_j) {
                  break L3;
                } else {
                  stackIn_7_0 = (wea) ((Object) stackIn_7_0);

                  if (!this.b((byte) -67)) {
                    break L3;
                  } else {
                    stackIn_8_0 = (wea) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = stackIn_7_2;
                    stackIn_8_3 = 1;
                    break L2;
                  }
                }
              }
              stackIn_8_0 = (wea) ((Object) stackIn_7_0);
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = stackIn_7_2;
              stackIn_8_3 = 0;
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
        field_g = new String[]{"<%0> didn't see the light", "<%0> went into the light", "<%0> was hit by a laser", "<%0> was lasered", "<%0> crossed the beam", "<%0> suddenly remembers that fiery-coloured beams of death should be avoided"};
        field_k = "Tutorial";
        field_i = "Resigned";
    }
}
