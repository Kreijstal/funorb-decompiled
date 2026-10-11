/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends hd {
    private hd[] field_Ab;
    static String field_yb;
    static int field_Eb;
    private hd[] field_Bb;
    int field_Db;
    private hd field_Cb;
    static String field_zb;

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          if (param1 != 63) {
            kf.c(true);
          }
          na.a(kt.field_g, true, wf.field_O, er.field_k, 1, param0, 0);
          for (var2_int = 0; var2_int < wf.field_O; var2_int++) {
            pf.field_d[var2_int + param0] = var2_int;
          }
          na.a(lm.field_V, false, wf.field_O + param0, vi.field_s, 1, param0 + param0, param0);
          if (wf.field_O > param0) {
            wf.field_O = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "kf.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_q = param6;
        this.field_mb = param1;
        this.field_s = param2;
        if (!param0) {
          this.a(79, -39, -98);
        }
        this.field_J = param5;
        this.a(param3, param4, 10000);
    }

    kf(long param0, hd param1, String[] param2, hd param3, hd[] param4, int param5) {
        super(param0, (hd) null);
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
        hd var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Bb = new hd[param2.length];
          this.field_Cb = new hd(0L, param3);
          this.field_Ab = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new hd(0L, param1);
            var9.field_E = param2[var8_int];
            this.field_Bb[var8_int] = var9;
            this.a((byte) -109, var9);
          }
          this.a((byte) -124, this.field_Cb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < param4.length) {
            this.field_Cb.a((byte) -127, param4[var11]);
            var11++;
          }
          this.field_Db = param5;
          this.field_Bb[param5].field_I = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("kf.<init>(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        hd dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = Kickabout.field_G;
        for (var4 = 0; this.field_Bb.length > var4; var4++) {
          var5 = var4 * this.field_q / this.field_Bb.length;
          var6 = this.field_q * (1 + var4) / this.field_Bb.length;
          this.field_Bb[var4].field_s = var5;
          this.field_Bb[var4].field_J = 0;
          this.field_Bb[var4].field_q = var6 - var5;
          this.field_Bb[var4].field_mb = param0;
        }
        this.field_Cb.a(true, this.field_q, 0, param0, this.field_mb - param0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_Ab.length) {
          this.field_Ab[var8].a(true, this.field_Cb.field_q - 2 * param1, param1, param1, this.field_Cb.field_mb - param1 * 2);
          if (~var8 != ~this.field_Db) {
            dupTemp$0 = this.field_Ab[var8];
            dupTemp$0.field_s = dupTemp$0.field_s + 10000;
          }
          var8++;
        }
        if (param2 != 10000) {
          this.field_Ab = (hd[]) null;
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        hd dupTemp$0 = null;
        hd dupTemp$1 = null;
        int var3;
        var3 = Kickabout.field_G;
        if (param0 < 36) {
          this.a(44, -42, 25);
        }
        for (var2 = 0; this.field_Bb.length > var2; var2++) {
          if (this.field_Db != var2 &&
            this.field_Bb[var2].field_sb != 0) {
            this.field_Bb[this.field_Db].field_I = false;
            dupTemp$0 = this.field_Ab[this.field_Db];
            dupTemp$0.field_s = dupTemp$0.field_s + 10000;
            this.field_Db = var2;
            this.field_Bb[var2].field_I = true;
            dupTemp$1 = this.field_Ab[var2];
            dupTemp$1.field_s = dupTemp$1.field_s - 10000;
          }
        }
    }

    public static void c(boolean param0) {
        field_yb = null;
        field_zb = null;
        if (!param0) {
          kf.a(67, (byte) -66);
        }
    }

    static {
        field_yb = "Enter name of friend to delete from list";
        field_zb = "Your game";
    }
}
