/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private int field_c;
    private tc field_e;
    private int field_d;
    private tc field_f;
    private tc[] field_a;
    static String field_b;

    final int a(byte param0) {
        int var3 = 0;
        tc var4 = null;
        tc var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; var3 < this.field_c; var3++) {
            var4 = this.field_a[var3];
            var5 = var4.field_b;
            while (var4 != var5) {
                var2++;
                var5 = var5.field_b;
            }
        }
        if (param0 < 109) {
            return 109;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
        fm.field_d[4] = param1;
        if (param0 != -1) {
            bg.a(87, 95);
        }
    }

    final tc b(int param0) {
        if (param0 != 1) {
            this.c((byte) -43);
        }
        this.field_d = 0;
        return this.b((byte) 85);
    }

    final tc a(int param0, long param1) {
        tc var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        tc var4 = this.field_a[(int)((long)(this.field_c + -1) & param1)];
        this.field_e = var4.field_b;
        if (param0 > -8) {
            bg.a(-7);
        }
        while (var4 != this.field_e) {
            if (!((param1 ^ -1L) != (this.field_e.field_i ^ -1L))) {
                var5 = this.field_e;
                this.field_e = this.field_e.field_b;
                return var5;
            }
            this.field_e = this.field_e.field_b;
        }
        this.field_e = null;
        return null;
    }

    final void c(byte param0) {
        int var2;
        tc var3_ref_tc;
        tc var4;
        int var5;
        int var3;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_c) {
            var3 = -28 / ((param0 - -43) / 39);
            this.field_f = null;
            this.field_e = null;
            return;
          } else {
            var3_ref_tc = this.field_a[var2];
            L1: while (true) {
              var4 = var3_ref_tc.field_b;
              if (var3_ref_tc != var4) {
                var4.d(-111);
                continue L1;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    bg(int param0) {
        int var2 = 0;
        tc dupTemp$0 = null;
        tc var3 = null;
        this.field_d = 0;
        this.field_a = new tc[param0];
        this.field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new tc();
            var3 = dupTemp$0;
            this.field_a[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_j = var3;
        }
    }

    final tc b(byte param0) {
        int fieldTemp$0 = 0;
        tc var4_ref = null;
        tc var2 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= 45) {
            this.a((byte) 90);
        }
        if (0 < this.field_d) {
            if (!(this.field_f == this.field_a[this.field_d - 1])) {
                var2 = this.field_f;
                this.field_f = var2.field_b;
                return var2;
            }
        }
        do {
            if (this.field_c <= this.field_d) {
                return null;
            }
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            var4_ref = this.field_a[fieldTemp$0].field_b;
            var2 = var4_ref;
        } while (var4_ref == this.field_a[this.field_d - 1]);
        this.field_f = var2.field_b;
        return var2;
    }

    public static void a(int param0) {
        if (param0 >= -2) {
            bg.a(-78);
        }
        field_b = null;
    }

    final void a(tc param0, long param1, int param2) {
        tc var5 = null;
        try {
            if (!(null == param0.field_j)) {
                param0.d(-128);
            }
            if (param2 < 14) {
                this.field_e = (tc) null;
            }
            var5 = this.field_a[(int)((long)(-1 + this.field_c) & param1)];
            param0.field_b = var5;
            param0.field_j = var5.field_j;
            param0.field_j.field_b = param0;
            param0.field_i = param1;
            param0.field_b.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Start Game";
    }
}
