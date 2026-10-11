/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private boolean field_d;
    private int[] field_a;
    static String field_e;
    private int field_b;
    private int field_c;

    public static void a(byte param0) {
        if (param0 != -13) {
          return;
        }
        field_e = null;
    }

    final void a(int[] param0, int param1) {
        try {
          this.a(this.field_b + 1, param0, 1, param0.length, param1);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "uh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.field_b) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.field_b) {
          bc.a(this.field_a, 1 + param0, this.field_a, param0, this.field_b - param0);
        }
        if (param1 > 4) {
          this.field_b = this.field_b - 1;
          return;
        }
        this.field_d = true;
        this.field_b = this.field_b - 1;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param0 > this.field_b) {
          this.field_b = param0;
          if (this.field_a.length <= param0) {
            this.a(0, param0);
          }
          if (param2 >= -116) {
            this.b(-63, (byte) -29);
            this.field_a[param0] = param1;
            return;
          }
          this.field_a[param0] = param1;
          return;
        }
        if (this.field_a.length <= param0) {
          this.a(0, param0);
        }
        if (param2 < -116) {
          this.field_a[param0] = param1;
          return;
        }
        this.b(-63, (byte) -29);
        this.field_a[param0] = param1;
    }

    private final int c(int param0, byte param1) {
        int var3;
        int var5;
        int var4;
        var5 = HoldTheLine.field_D;
        var3 = this.field_a.length;
        while (param0 >= var3) {
          if (!this.field_d) {
            var3 = var3 + this.field_c;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_c;
        }
        var4 = -18 % ((45 - param1) / 53);
        return var3;
    }

    final int[] a(int param0) {
        int[] var3 = new int[this.field_b + 1];
        int[] var2 = var3;
        if (param0 <= -33) {
          bc.a(this.field_a, 0, var3, 0, this.field_b + 1);
          return var3;
        }
        return (int[]) null;
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.c(param1, (byte) -81)];
        int[] var3 = var4;
        bc.a(this.field_a, 0, var4, param0, this.field_a.length);
        this.field_a = var4;
    }

    final void a(int param0, byte param1) {
        if (param1 >= 61) {
          this.a(1 + this.field_b, param0, (byte) -119);
          return;
        }
        this.b(-32);
        this.a(1 + this.field_b, param0, (byte) -119);
    }

    private final void a(int param0, int[] param1, int param2, int param3, int param4) {
        try {
          if (this.field_b < param3 + (param0 - param2)) {
            this.field_b = -1 + param3 + param0;
            this.a(param2 ^ 1, param3 + (param0 - 1));
          }
          bc.a(param1, param4, this.field_a, param0, param3);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "uh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(byte param0, int param1) {
        if (this.field_b < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 > 3) {
          return this.field_a[param1];
        }
        this.field_c = -4;
        return this.field_a[param1];
    }

    final int b(int param0) {
        if (param0 >= -110) {
          this.a(-118);
          return 1 + this.field_b;
        }
        return 1 + this.field_b;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          uh.a((byte) -39);
          ak.field_c = param2;
          jf.field_b = param0;
          return;
        }
        ak.field_c = param2;
        jf.field_b = param0;
    }

    uh(int param0, boolean param1) {
        this.field_a = new int[]{};
        this.field_b = -1;
        this.field_d = false;
        this.field_c = param0;
        this.field_d = param1 ? true : false;
    }

    static {
        field_e = "Change display name";
    }
}
