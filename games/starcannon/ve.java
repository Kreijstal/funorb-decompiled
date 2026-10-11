/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    private int field_c;
    private int field_a;
    static lf field_f;
    static String field_g;
    private int[] field_e;
    static boolean field_d;
    private boolean field_b;

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 32729) {
          field_d = true;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          this.a(99, -59);
          return this.field_c + 1;
        }
        return this.field_c + 1;
    }

    final int a(int param0, int param1) {
        if (param1 > this.field_c) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 == 0) {
          return this.field_e[param1];
        }
        this.b(-84, 4);
        return this.field_e[param1];
    }

    private final void a(int param0, int param1, boolean param2) {
        if (param0 > this.field_c) {
          this.field_c = param0;
          if (this.field_e.length <= param0) {
            this.d(param0, 0);
          }
          if (param2) {
            this.field_e[param0] = param1;
            return;
          }
          return;
        }
        if (this.field_e.length <= param0) {
          this.d(param0, 0);
        }
        if (param2) {
          this.field_e[param0] = param1;
          return;
        }
    }

    private final void d(int param0, int param1) {
        int[] var4 = new int[this.a(param0, (byte) -77)];
        int[] var3 = var4;
        ug.a(this.field_e, 0, var4, param1, this.field_e.length);
        this.field_e = var4;
    }

    private final int a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = StarCannon.field_A;
        if (param1 != -77) {
          return -123;
        }
        var3 = this.field_e.length;
        while (param0 >= var3) {
          if (!this.field_b) {
            var3 = var3 + this.field_a;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_a;
        }
        return var3;
    }

    final void c(int param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 <= this.field_c) {
          if (param1 != this.field_c) {
            ug.a(this.field_e, param1 + 1, this.field_e, param1, this.field_c - param1);
          }
          this.field_c = this.field_c - 1;
          int var3 = 50 % ((param0 - 50) / 54);
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final void b(int param0, int param1) {
        this.a(param1 + this.field_c, param0, true);
    }

    private ve() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "LANCE POWER:";
    }
}
