/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends hl {
    static String field_Nb;
    int field_Lb;
    private hl[] field_Kb;
    private hl[] field_Mb;
    private hl field_Ob;

    ad(long param0, hl param1, String[] param2, hl param3, hl[] param4, int param5) {
        super(param0, (hl) null);
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
        hl var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Mb = new hl[param2.length];
          this.field_Ob = new hl(0L, param3);
          this.field_Kb = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new hl(0L, param1);
            var9.field_jb = param2[var8_int];
            this.field_Mb[var8_int] = var9;
            this.a((byte) -101, var9);
          }
          this.a((byte) -125, this.field_Ob);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_Ob.a((byte) 72, param4[var11]);
            var11++;
          }
          this.field_Lb = param5;
          this.field_Mb[param5].field_zb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != 43) {
          field_Nb = (String) null;
        }
        field_Nb = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        hg.field_f[param2] = param6;
        hg.field_g[param2] = param4;
        hg.field_h[param2] = param5;
        if (param1 != 0) {
          return;
        }
        try {
          hg.field_b[param2] = param0;
          hg.field_j[param2] = param3;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ad.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        hl dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = TetraLink.field_J;
        for (var4 = 0; this.field_Mb.length > var4; var4++) {
          var5 = var4 * this.field_Hb / this.field_Mb.length;
          var6 = (1 + var4) * this.field_Hb / this.field_Mb.length;
          this.field_Mb[var4].field_M = var5;
          this.field_Mb[var4].field_yb = 0;
          this.field_Mb[var4].field_Hb = var6 - var5;
          this.field_Mb[var4].field_R = param1;
        }
        this.field_Ob.a((byte) -117, this.field_Hb, param1, this.field_R - param1, 0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_Kb.length) {
          this.field_Kb[var8].a((byte) -90, this.field_Ob.field_Hb - param2 * 2, param2, this.field_Ob.field_R - 2 * param2, param2);
          if (~this.field_Lb != ~var8) {
            dupTemp$0 = this.field_Kb[var8];
            dupTemp$0.field_M = dupTemp$0.field_M + 10000;
          }
          var8++;
        }
        if (param0 != -8325) {
          this.field_Mb = (hl[]) null;
        }
    }

    final void c(boolean param0) {
        hl dupTemp$0 = null;
        hl dupTemp$1 = null;
        int var2;
        int var3;
        var3 = TetraLink.field_J;
        var2 = 0;
        if (!param0) {
          ad.d((byte) 85);
        }
        while (this.field_Mb.length > var2) {
          if (this.field_Lb != var2 &&
            0 != this.field_Mb[var2].field_F) {
            this.field_Mb[this.field_Lb].field_zb = false;
            dupTemp$0 = this.field_Kb[this.field_Lb];
            dupTemp$0.field_M = dupTemp$0.field_M + 10000;
            this.field_Lb = var2;
            this.field_Mb[var2].field_zb = true;
            dupTemp$1 = this.field_Kb[var2];
            dupTemp$1.field_M = dupTemp$1.field_M - 10000;
          }
          var2++;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != 0) {
          this.field_Kb = (hl[]) null;
        }
        this.field_M = param2;
        this.field_yb = param4;
        this.field_Hb = param5;
        this.field_R = param1;
        this.a(param0 - 8325, param6, param3);
    }

    static {
        field_Nb = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
