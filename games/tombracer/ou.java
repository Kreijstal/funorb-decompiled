/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ou {
    private qea field_c;
    static int[] field_e;
    int field_a;
    private int[] field_d;
    private int field_b;

    public static void a(int param0) {
        field_e = null;
        if (param0 < 98) {
            ou.a(56);
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -23) {
            return false;
        }
        return this.field_c.a(2, 0) == 0 ? true : false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        this.field_c = new qea(new int[]{this.field_b});
        this.field_d = new int[this.field_a];
        var2 = 0;
        L0: while (true) {
          if (var2 < this.field_a) {
            this.field_d[var2] = this.field_c.b(95);
            var2++;
            if (var3 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            var2 = -123 % ((-62 - param0) / 49);
            return;
          }
        }
    }

    abstract wea a(byte param0);

    ou(int param0, int param1) {
        this.field_a = param0;
        this.field_b = param1;
        this.b(-125);
    }

    static {
    }
}
