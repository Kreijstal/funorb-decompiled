/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int[] field_c;
    private int field_f;
    private boolean field_e;
    static cn field_g;
    static int[] field_a;
    static String field_b;
    private int field_d;

    final int b(int param0) {
        if (param0 != -1) {
          return -58;
        }
        return this.field_d + 1;
    }

    final int b(int param0, int param1) {
        if (this.field_d < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 == -1) {
          return this.field_c[param1];
        }
        field_a = (int[]) null;
        return this.field_c[param1];
    }

    final void a(int param0, byte param1) {
        int var3 = 91 / ((param1 - 26) / 53);
        this.a(this.field_d + 1, param0, -1);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 != 0) {
          field_a = (int[]) null;
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param1 == -12364) {
          var4 = new int[this.a((byte) 24, param0)];
          var3 = var4;
          lua.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        }
        this.field_f = 94;
        var4Lifetime1 = new int[this.a((byte) 24, param0)];
        var3Lifetime1 = var4Lifetime1;
        lua.a(this.field_c, 0, var4Lifetime1, 0, this.field_c.length);
        this.field_c = var4Lifetime1;
    }

    private final int a(byte param0, int param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 24) {
          return -80;
        }
        var3 = this.field_c.length;
        while (param1 >= var3) {
          if (!this.field_e) {
            var3 = var3 + this.field_f;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_f;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final void a(int param0, int param1) {
        if (param1 <= 25) {
          return;
        }
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.field_d < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 == this.field_d) {
          this.field_d = this.field_d - 1;
          return;
        }
        lua.a(this.field_c, param0 + 1, this.field_c, param0, this.field_d - param0);
        this.field_d = this.field_d - 1;
    }

    private tq() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_d < param0) {
          this.field_d = param0;
          if (param2 != -1) {
            return;
          }
          if (this.field_c.length <= param0) {
            this.c(param0, param2 ^ 12363);
            this.field_c[param0] = param1;
            return;
          }
          this.field_c[param0] = param1;
          return;
        }
        if (param2 != -1) {
          return;
        }
        if (this.field_c.length > param0) {
          this.field_c[param0] = param1;
          return;
        }
        this.c(param0, param2 ^ 12363);
        this.field_c[param0] = param1;
    }

    static {
        field_b = "Offensive account name";
        field_a = new int[1];
    }
}
