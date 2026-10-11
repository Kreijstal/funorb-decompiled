/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static String field_h;
    static int field_j;
    int[] field_a;
    int field_b;
    static ge field_f;
    static String field_d;
    static fg[] field_c;
    static int[] field_g;
    int field_e;
    static he[] field_i;

    final int a(int param0, int param1) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null == this.field_a) {
          return 0;
        }
        if (this.field_a.length == 0) {
          return 0;
        }
        int var3 = 1;
        if (param0 == -21878) {
          while (this.field_a.length > var3) {
            if (this.field_a[var3] + this.field_a[-1 + var3] >> 1 > param1) {
              return var3 - 1;
            }
            var3++;
          }
          return -1 + this.field_a.length;
        }
        this.a(84, -16);
        while (this.field_a.length > var3) {
          if (this.field_a[var3] + this.field_a[-1 + var3] >> 1 > param1) {
            return var3 - 1;
          }
          var3++;
        }
        return -1 + this.field_a.length;
    }

    final static nh a(int param0, byte param1, int param2) {
        nh var6 = null;
        nh var3 = null;
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        nh var6Lifetime1;
        nh var3Lifetime1;
        int var4Lifetime1;
        if (param1 >= -62) {
          mi.b((byte) 48);
        } else {
          var6 = new nh(param0, param0);
          var3 = var6;
          for (var4 = 0; var3.field_B.length > var4; var4++) {
            var6.field_B[var4] = param2;
          }
          return var3;
        }
        var6Lifetime1 = new nh(param0, param0);
        var3Lifetime1 = var6Lifetime1;
        for (var4Lifetime1 = 0; var3Lifetime1.field_B.length > var4Lifetime1; var4Lifetime1++) {
          var6Lifetime1.field_B[var4Lifetime1] = param2;
        }
        return var3Lifetime1;
    }

    final int a(byte param0) {
        if (param0 <= 92) {
          return 8;
        }
        if (null == this.field_a) {
          return 0;
        }
        if (this.field_a.length != 0) {
          return this.field_a[this.field_a.length - 1];
        }
        return 0;
    }

    public static void b(byte param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_i = null;
        field_c = null;
        field_g = null;
        if (param0 <= 61) {
          field_f = (ge) null;
          return;
        }
    }

    mi(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_b = param1;
        this.field_a = new int[1 + param2];
    }

    static {
        field_h = "Friends can be added in multiplayer<nbsp>games";
    }
}
