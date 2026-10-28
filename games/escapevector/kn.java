/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    private int field_e;
    static String field_c;
    static int field_b;
    static String field_f;
    static Sprite field_h;
    private int[] field_a;
    private boolean field_d;
    private int field_g;

    private final void a(int param0, int param1, boolean param2) {
        if (param0 > this.field_g) {
          this.field_g = param0;
          if (this.field_a.length <= param0) {
            this.b(0, param0);
          }
          if (param2) {
            this.a(-30, 101);
            this.field_a[param0] = param1;
            return;
          }
          this.field_a[param0] = param1;
          return;
        }
        if (this.field_a.length <= param0) {
          this.b(0, param0);
        }
        if (!param2) {
          this.field_a[param0] = param1;
          return;
        }
        this.a(-30, 101);
        this.field_a[param0] = param1;
    }

    public static void releaseStatics(boolean guard) {
        field_f = null;
        field_c = null;
        field_h = null;
        if (!guard) {
          kn.a((byte) 76);
        }
    }

    final void c(int param0, int param1) {
        if (param1 < param0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 <= this.field_g) {
          if (this.field_g != param1) {
            qg.a(this.field_a, param1 + 1, this.field_a, param1, this.field_g - param1);
          }
          this.field_g = this.field_g - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final void a(int param0, byte param1) {
        this.a(this.field_g + 1, param0, false);
        if (param1 != -51) {
          this.a(false);
        }
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.d(param0, param1)];
        int[] var3 = var4;
        qg.a(this.field_a, 0, var4, 0, this.field_a.length);
        this.field_a = var4;
    }

    final static void a(byte param0) {
        mb.field_g = EmailSyntaxValidator.c(false);
        bo.field_F = new tb();
        if (param0 > -21) {
          return;
        }
        ve.a(-43, true, true);
    }

    final int a(int param0, int param1) {
        if (this.field_g < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 < -5) {
          return this.field_a[param1];
        }
        kn.b(false);
        return this.field_a[param1];
    }

    private final int d(int param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        if (param0 != 0) {
          return 34;
        }
        int var3 = this.field_a.length;
        while (param1 >= var3) {
          if (!this.field_d) {
            var3 = var3 + this.field_e;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_e;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private kn() throws Throwable {
        throw new Error();
    }

    final static sn b(boolean param0) {
        if (!param0) {
          return (sn) null;
        }
        return new sn(TrackerMusicDefinition.c(31069), jc.c(-89));
    }

    final int a(boolean param0) {
        if (!param0) {
          this.a(106, 72);
          return this.field_g + 1;
        }
        return this.field_g + 1;
    }

    static {
        field_c = "Names cannot start or end with space or underscore";
        field_f = "Score";
    }
}
