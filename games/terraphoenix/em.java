/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static ci field_c;
    int field_a;
    int field_e;
    static String field_b;
    int[] field_d;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Terraphoenix.field_V;
        if (this.field_d == null) {
          return 0;
        }
        if (this.field_d.length == 0) {
          return 0;
        }
        if (param1 <= -115) {
          for (var3 = 1; this.field_d.length > var3; var3++) {
            if (param0 < (this.field_d[var3] + this.field_d[var3 - 1] >> 1)) {
              return var3 - 1;
            }
          }
          return this.field_d.length - 1;
        }
        this.a(-82, 56);
        for (var3Lifetime1 = 1; this.field_d.length > var3Lifetime1; var3Lifetime1++) {
          if (param0 < (this.field_d[var3Lifetime1] + this.field_d[var3Lifetime1 - 1] >> 1)) {
            return var3Lifetime1 - 1;
          }
        }
        return this.field_d.length - 1;
    }

    final int b(int param0) {
        if (param0 != -1) {
          field_c = (ci) null;
          if (null == this.field_d) {
            return 0;
          }
          if (this.field_d.length != 0) {
            return this.field_d[this.field_d.length - 1];
          }
          return 0;
        }
        if (null == this.field_d) {
          return 0;
        }
        if (this.field_d.length != 0) {
          return this.field_d[this.field_d.length - 1];
        }
        return 0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 >= -118) {
          field_c = (ci) null;
        }
    }

    em(int param0, int param1, int param2) {
        this.field_a = param1;
        this.field_e = param0;
        this.field_d = new int[param2 + 1];
    }

    static {
        field_b = "Invalid password.";
    }
}
