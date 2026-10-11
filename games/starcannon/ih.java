/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    private int field_e;
    static int[] field_g;
    static String field_f;
    private int field_h;
    static int[] field_d;
    private rf field_i;
    private rf[] field_b;
    private rf field_a;
    static mj field_c;

    final void a(long param0, byte param1, rf param2) {
        rf var5 = null;
        try {
          if (param2.field_d != null) {
            param2.b(4);
          }
          var5 = this.field_b[(int)(param0 & (long)(this.field_e - 1))];
          param2.field_d = var5.field_d;
          if (param1 != -100) {
            this.a(-118);
          }
          param2.field_a = var5;
          param2.field_d.field_a = param2;
          param2.field_b = param0;
          param2.field_a.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ih.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final rf a(int param0) {
        if (param0 != -1) {
          this.a(-125L, (byte) 91);
          this.field_h = 0;
          return this.a((byte) 111);
        }
        this.field_h = 0;
        return this.a((byte) 111);
    }

    final rf a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        int var4;
        rf var5;
        rf var6;
        rf var10;
        rf var13;
        var4 = StarCannon.field_A;
        var2 = -28 % ((36 - param0) / 51);
        if (0 >= this.field_h) {
          do {
            if (this.field_h >= this.field_e) {
              return null;
            }
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            var5 = this.field_b[fieldTemp$1].field_a;
            var6 = var5;
          } while (var5 == this.field_b[-1 + this.field_h]);
          this.field_a = var6.field_a;
          return var6;
        }
        if (this.field_b[this.field_h - 1] != this.field_a) {
          var13 = this.field_a;
          this.field_a = var13.field_a;
          return var13;
        }
        do {
          if (this.field_h >= this.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          var5 = this.field_b[fieldTemp$0].field_a;
          var10 = var5;
        } while (var5 == this.field_b[-1 + this.field_h]);
        this.field_a = var10.field_a;
        return var10;
    }

    public static void b(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        int var1 = -125 / ((-78 - param0) / 46);
        field_g = null;
    }

    ih(int param0) {
        int var2 = 0;
        rf dupTemp$1 = null;
        rf var3;
        this.field_h = 0;
        this.field_b = new rf[param0];
        this.field_e = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new rf();
          var3 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          var3.field_a = var3;
          var3.field_d = var3;
        }
    }

    final rf a(long param0, byte param1) {
        rf var5 = null;
        int var6 = StarCannon.field_A;
        rf var4 = this.field_b[(int)(param0 & (long)(this.field_e - 1))];
        this.field_i = var4.field_a;
        if (param1 >= 5) {
          while (var4 != this.field_i) {
            if (~param0 == ~this.field_i.field_b) {
              var5 = this.field_i;
              this.field_i = this.field_i.field_a;
              return var5;
            }
            this.field_i = this.field_i.field_a;
          }
          this.field_i = null;
          return null;
        }
        return (rf) null;
    }

    static {
        field_g = new int[8192];
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new int[16384];
        field_c = new mj("");
    }
}
