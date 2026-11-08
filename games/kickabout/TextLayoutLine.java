/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    int field_d;
    static Sprite field_f;
    int field_g;
    static int field_e;
    int[] field_b;
    static Sprite field_a;
    static String field_c;

    final int width(byte param0) {
        int var2 = -121 / ((-14 - param0) / 44);
        if (this.field_b == null) {
          return 0;
        }
        if (this.field_b.length != 0) {
          return this.field_b[-1 + this.field_b.length];
        }
        return 0;
    }

    final static int a(int param0, int param1) {
        int var2 = MatchHudSupport.screenToWorldY(param1, param0 ^ -2167);
        if (FaceNormal.field_c) {
          var2 = -var2 + 1344;
        }
        if (param0 == -6779) {
          return var2;
        }
        TextLayoutLine.releaseStatics((byte) -5);
        return var2;
    }

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Kickabout.field_G;
        if (param0 == 101) {
          if (this.field_b == null) {
            return 0;
          }
          if (this.field_b.length == 0) {
            return 0;
          }
          for (var3 = 1; this.field_b.length > var3; var3++) {
            if (this.field_b[-1 + var3] + this.field_b[var3] >> 1 > param1) {
              return var3 - 1;
            }
          }
          return this.field_b.length - 1;
        }
        field_e = -68;
        if (this.field_b == null) {
          return 0;
        }
        if (this.field_b.length == 0) {
          return 0;
        }
        for (var3Lifetime1 = 1; this.field_b.length > var3Lifetime1; var3Lifetime1++) {
          if (this.field_b[-1 + var3Lifetime1] + this.field_b[var3Lifetime1] >> 1 > param1) {
            return var3Lifetime1 - 1;
          }
        }
        return this.field_b.length - 1;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -25) {
          TextLayoutLine.a(75, 93);
          field_f = null;
          return;
        }
        field_f = null;
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.field_d = param1;
        this.field_g = param0;
        this.field_b = new int[1 + param2];
    }

    static {
        field_e = 470;
        field_c = "Waiting for sound effects";
    }
}
