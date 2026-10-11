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
        int var4 = 0;
        wea var2;
        int[] var3;
        int var5;
        wea var6;
        wea stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        boolean stackIn_8_3;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = new wea(this.field_a);
        var2 = var6;
        var3 = ht.d(this.field_f, true);
        if (param0 != 58) {
          this.field_j = true;
        }
        for (var4 = 0; var4 < this.field_a; var4++) {
          stackIn_7_0 = var6;
          stackIn_7_1 = var4;
          stackIn_7_2 = var3[var4];
          stackIn_8_3 = (!this.field_j) && (this.b((byte) -67));
          ((wea) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_8_3, (byte) -36);
        }
        return var2;
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
