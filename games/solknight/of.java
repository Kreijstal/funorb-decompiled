/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    private int[] field_a;
    private int field_c;
    private boolean field_i;
    private int field_h;
    static o[] field_b;
    static int field_g;
    static o field_d;
    static long field_e;
    static o field_f;

    public static void a(int param0) {
        if (param0 == 1) {
          field_f = null;
          field_b = null;
          field_d = null;
          return;
        }
        field_g = 47;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    final void c(int param0, int param1) {
        int var3 = -67 % ((-45 - param0) / 43);
        this.a(1 + this.field_h, (byte) 61, param1);
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        var3 = this.field_a.length;
        if (param1 >= -98) {
          return -103;
        }
        while (var3 <= param0) {
          if (!this.field_i) {
            var3 = var3 + this.field_c;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_c;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final void a(boolean param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 > this.field_h) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_h != param1) {
          fk.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_h);
        }
        this.field_h = this.field_h - 1;
        if (!param0) {
          this.b(-55);
          return;
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, byte param1, int param2) {
        if (param0 > this.field_h) {
          this.field_h = param0;
        }
        if (this.field_a.length <= param0) {
          this.b(param0, 0);
          if (param1 != 61) {
            field_f = (o) null;
            this.field_a[param0] = param2;
            return;
          }
          this.field_a[param0] = param2;
          return;
        }
        if (param1 == 61) {
          this.field_a[param0] = param2;
          return;
        }
        field_f = (o) null;
        this.field_a[param0] = param2;
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.a(param0, -113)];
        int[] var3 = var4;
        fk.a(this.field_a, param1, var4, 0, this.field_a.length);
        this.field_a = var4;
    }

    final int a(byte param0, int param1) {
        if (this.field_h < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 == 43) {
          return this.field_a[param1];
        }
        this.field_h = 68;
        return this.field_a[param1];
    }

    final int b(int param0) {
        if (param0 <= 74) {
          this.a((byte) -24, -1);
          return this.field_h + 1;
        }
        return this.field_h + 1;
    }

    static {
        field_g = 0;
    }
}
