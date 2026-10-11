/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_c;
    static String field_d;
    int[] field_b;
    static java.awt.Font field_a;
    int field_e;

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          return -25;
        }
        if (null == this.field_b) {
          return 0;
        }
        if (this.field_b.length == 0) {
          return 0;
        }
        for (var3 = 1; this.field_b.length > var3; var3++) {
          if (param1 < (this.field_b[var3] + this.field_b[-1 + var3] >> 1)) {
            return var3 - 1;
          }
        }
        return this.field_b.length - 1;
    }

    final int b(int param0) {
        if (param0 < 20) {
          return -36;
        }
        if (null == this.field_b) {
          return 0;
        }
        if (this.field_b.length != 0) {
          return this.field_b[-1 + this.field_b.length];
        }
        return 0;
    }

    public static void a(int param0) {
        if (param0 != 4324) {
          ha.a(-34);
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static boolean a(byte param0) {
        if (!sr.field_h) {
          return false;
        }
        if (param0 <= 94) {
          ha.a((byte) 11);
          if (em.field_h == 0) {
            return true;
          }
          return false;
        }
        if (em.field_h == 0) {
          return true;
        }
        return false;
    }

    ha(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = param1;
        this.field_b = new int[1 + param2];
    }

    static {
        field_d = "Pause Menu";
    }
}
