/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends UiComponent {
    static long[] field_xb;
    private UiComponent field_tb;
    private UiComponent[] field_vb;
    private UiComponent[] field_ub;
    int field_wb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_t = param5;
        if (param4 != -25436) {
          bv.d((byte) 19);
        }
        this.field_T = param3;
        this.field_G = param2;
        this.field_qb = param6;
        this.b(param1, 32, param0);
    }

    final static void d(byte param0) {
        TextInputWidget.g((byte) -113);
        int var1 = -34 % ((10 - param0) / 47);
    }

    final void e(byte param0) {
        UiComponent dupTemp$0 = null;
        UiComponent dupTemp$1 = null;
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 >= -97) {
          this.field_wb = -14;
        }
        while (var2 < this.field_ub.length) {
          if (var2 != this.field_wb &&
            this.field_ub[var2].field_y != 0) {
            this.field_ub[this.field_wb].field_cb = false;
            dupTemp$0 = this.field_vb[this.field_wb];
            dupTemp$0.field_qb = dupTemp$0.field_qb + 10000;
            this.field_wb = var2;
            this.field_ub[var2].field_cb = true;
            dupTemp$1 = this.field_vb[var2];
            dupTemp$1.field_qb = dupTemp$1.field_qb - 10000;
          }
          var2++;
        }
    }

    private final void b(int param0, int param1, int param2) {
        UiComponent dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param1 != 32) {
          field_xb = (long[]) null;
        }
        for (var4 = 0; var4 < this.field_ub.length; var4++) {
          var5 = var4 * this.field_G / this.field_ub.length;
          var6 = (var4 + 1) * this.field_G / this.field_ub.length;
          this.field_ub[var4].field_qb = var5;
          this.field_ub[var4].field_T = 0;
          this.field_ub[var4].field_G = -var5 + var6;
          this.field_ub[var4].field_t = param2;
        }
        this.field_tb.setBounds(this.field_G, this.field_t - param2, -23776, param2, 0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_vb.length) {
          this.field_vb[var8].setBounds(this.field_tb.field_G - param0 * 2, -(param0 * 2) + this.field_tb.field_t, -23776, param0, param0);
          if (this.field_wb != var8) {
            dupTemp$0 = this.field_vb[var8];
            dupTemp$0.field_qb = dupTemp$0.field_qb + 10000;
          }
          var8++;
        }
    }

    public static void releaseStatics(int param0) {
        field_xb = null;
        if (param0 != 0) {
          bv.releaseStatics(30);
        }
    }

    bv(long param0, UiComponent param1, String[] param2, UiComponent param3, UiComponent[] param4, int param5) {
        super(param0, (UiComponent) null);
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
        UiComponent var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_ub = new UiComponent[param2.length];
          this.field_tb = new UiComponent(0L, param3);
          this.field_vb = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new UiComponent(0L, param1);
            var9.field_r = param2[var8_int];
            this.field_ub[var8_int] = var9;
            this.b(-124, var9);
          }
          this.b(-128, this.field_tb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_tb.b(-122, param4[var11]);
            var11++;
          }
          this.field_wb = param5;
          this.field_ub[param5].field_cb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("bv.<init>(").append(param0).append(',');
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
          throw tba.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_xb = new long[32];
    }
}
