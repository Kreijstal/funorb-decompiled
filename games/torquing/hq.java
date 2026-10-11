/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq {
    static String field_c;
    private int field_i;
    private int[] field_f;
    private boolean field_g;
    private int field_b;
    static String[] field_d;
    static vh field_a;
    static t[] field_h;
    static String field_e;

    private final int a(byte param0, int param1) {
        int var3;
        int var4;
        var4 = Torquing.field_u;
        if (param0 != -6) {
          return -92;
        }
        var3 = this.field_f.length;
        while (var3 <= param1) {
          if (!this.field_g) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_b;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final void c(int param0, int param1) {
        if (param1 != 17424) {
          return;
        }
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.field_i) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 == this.field_i) {
          this.field_i = this.field_i - 1;
          return;
        }
        dk.a(this.field_f, param0 + 1, this.field_f, param0, this.field_i - param0);
        this.field_i = this.field_i - 1;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 == -1) {
          field_a = null;
          field_e = null;
          field_d = null;
          field_h = null;
          return;
        }
        hq.a(-97);
        field_a = null;
        field_e = null;
        field_d = null;
        field_h = null;
    }

    private final void a(int param0, boolean param1, int param2) {
        if (this.field_i < param2) {
          this.field_i = param2;
        }
        if (param1) {
          if (this.field_f.length <= param2) {
            this.a(0, param2);
          }
          this.field_f[param2] = param0;
          return;
        }
        this.field_g = true;
        if (this.field_f.length <= param2) {
          this.a(0, param2);
        }
        this.field_f[param2] = param0;
    }

    final void d(int param0, int param1) {
        this.a(param0, true, 1 + this.field_i);
        if (param1 != -8673) {
          this.a(true);
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a((byte) -6, param1)];
        int[] var3 = var4;
        dk.a(this.field_f, param0, var4, 0, this.field_f.length);
        this.field_f = var4;
    }

    private hq() throws Throwable {
        throw new Error();
    }

    final int b(int param0, int param1) {
        if (param1 > this.field_i) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 >= 29) {
          return this.field_f[param1];
        }
        return 94;
    }

    final int a(boolean param0) {
        if (!param0) {
          return 105;
        }
        return this.field_i + 1;
    }

    static {
        field_c = "Login: ";
        field_d = new String[3];
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
