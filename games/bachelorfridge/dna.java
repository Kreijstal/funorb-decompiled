/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dna extends sna {
    private sna field_vb;
    private sna[] field_xb;
    int field_yb;
    private sna[] field_wb;

    final void f(int param0) {
        int var2 = 0;
        sna dupTemp$0 = null;
        sna dupTemp$1 = null;
        int var3;
        var3 = BachelorFridge.field_y;
        for (var2 = 0; var2 < this.field_xb.length; var2++) {
          if (var2 != this.field_yb &&
            0 != this.field_xb[var2].field_R) {
            this.field_xb[this.field_yb].field_t = false;
            dupTemp$0 = this.field_wb[this.field_yb];
            dupTemp$0.field_kb = dupTemp$0.field_kb + 10000;
            this.field_yb = var2;
            this.field_xb[var2].field_t = true;
            dupTemp$1 = this.field_wb[var2];
            dupTemp$1.field_kb = dupTemp$1.field_kb - 10000;
          }
        }
        if (param0 != 18632) {
          dna.f((byte) 59);
        }
    }

    dna(long param0, sna param1, String[] param2, sna param3, sna[] param4, int param5) {
        super(param0, (sna) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        sna var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_xb = new sna[param2.length];
          this.field_vb = new sna(0L, param3);
          this.field_wb = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new sna(0L, param1);
            var9.field_Z = param2[var8_int];
            this.field_xb[var8_int] = var9;
            this.a(-1, var9);
          }
          this.a(-1, this.field_vb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_vb.a(-1, param4[var11]);
            var11++;
          }
          this.field_yb = param5;
          this.field_xb[param5].field_t = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("dna.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void c(int param0, boolean param1) {
        int var2 = (kg.field_b - 640) / 2;
        int var3 = saa.field_b * saa.field_b;
        int var4 = var3 - param0 * param0;
        ela.field_i.a(dg.field_c - 124 - 90, 31407, 199, -(199 * var4 / var3) + var2, 90);
        if (param1) {
          dna.f((byte) 74);
        }
        ho.field_g.a(-4 + dg.field_c - 120, 31407, 438, var4 * 438 / var3 + (var2 + 202), 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_kb = param1;
        this.field_rb = param5;
        this.field_p = param3;
        if (param2 != 0) {
          dna.f((byte) -76);
        }
        this.field_sb = param4;
        this.a(false, param0, param6);
    }

    final static void f(byte param0) {
        if (param0 != -12) {
          return;
        }
        dda.c(param0 - 31021);
    }

    final static int b(int param0, boolean param1) {
        String var2 = lka.field_E[param0][4];
        var2 = var2.trim();
        if (param1) {
          return 84;
        }
        var2 = var2.toLowerCase();
        return ((ji) (cw.field_zb.a(!param1 ? true : false, (long)var2.hashCode()))).field_h;
    }

    private final void a(boolean param0, int param1, int param2) {
        sna dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = BachelorFridge.field_y;
        for (var4 = 0; this.field_xb.length > var4; var4++) {
          var5 = this.field_sb * var4 / this.field_xb.length;
          var6 = this.field_sb * (var4 + 1) / this.field_xb.length;
          this.field_xb[var4].field_kb = var5;
          this.field_xb[var4].field_rb = 0;
          this.field_xb[var4].field_sb = var6 - var5;
          this.field_xb[var4].field_p = param2;
        }
        this.field_vb.a(-param2 + this.field_p, 31407, this.field_sb, 0, param2);
        var8 = 0;
        var4Lifetime1 = var8;
        if (param0) {
          return;
        }
        while (this.field_wb.length > var8) {
          this.field_wb[var8].a(this.field_vb.field_p - param1 * 2, 31407, -(param1 * 2) + this.field_vb.field_sb, param1, param1);
          if (this.field_yb != var8) {
            dupTemp$0 = this.field_wb[var8];
            dupTemp$0.field_kb = dupTemp$0.field_kb + 10000;
          }
          var8++;
        }
    }

    static {
    }
}
