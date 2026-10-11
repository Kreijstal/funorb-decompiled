/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends qr {
    private qr[] field_xb;
    static int[] field_Ab;
    private qr[] field_Db;
    private qr field_yb;
    static bi field_Cb;
    int field_zb;
    static int field_Bb;

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (param5) {
          this.field_xb = (qr[]) null;
        }
        this.field_mb = param2;
        this.field_hb = param4;
        this.field_K = param0;
        this.field_db = param1;
        this.a(-4783, param3, param6);
    }

    public static void f(byte param0) {
        int var1 = 32 / ((param0 - 65) / 55);
        field_Cb = null;
        field_Ab = null;
    }

    final void f(boolean param0) {
        int var2 = 0;
        qr dupTemp$0 = null;
        qr dupTemp$1 = null;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          field_Bb = 3;
        }
        for (var2 = 0; this.field_Db.length > var2; var2++) {
          if (this.field_zb != var2 &&
            0 != this.field_Db[var2].field_rb) {
            this.field_Db[this.field_zb].field_bb = false;
            dupTemp$0 = this.field_xb[this.field_zb];
            dupTemp$0.field_hb = dupTemp$0.field_hb + 10000;
            this.field_zb = var2;
            this.field_Db[var2].field_bb = true;
            dupTemp$1 = this.field_xb[var2];
            dupTemp$1.field_hb = dupTemp$1.field_hb - 10000;
          }
        }
    }

    q(long param0, qr param1, String[] param2, qr param3, qr[] param4, int param5) {
        super(param0, (qr) null);
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
        qr var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Db = new qr[param2.length];
          this.field_yb = new qr(0L, param3);
          this.field_xb = param4;
          for (var8_int = 0; param2.length > var8_int; var8_int++) {
            var9 = new qr(0L, param1);
            var9.field_z = param2[var8_int];
            this.field_Db[var8_int] = var9;
            this.a(4, var9);
          }
          this.a(4, this.field_yb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < param4.length) {
            this.field_yb.a(4, param4[var11]);
            var11++;
          }
          this.field_zb = param5;
          this.field_Db[param5].field_bb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("q.<init>(").append(param0).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((0 >= param1 ||
            param1 >= 128) && (param1 < 160 ||
            param1 > 255)) {
            if (param1 == 8364) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (402 == param1) {
              var2 = -125;
            } else if (param1 == 8222) {
              var2 = -124;
            } else if (param1 == 8230) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (param1 == 710) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (8249 == param1) {
              var2 = -117;
            } else if (338 == param1) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (param1 == 8217) {
              var2 = -110;
            } else if (8220 == param1) {
              var2 = -109;
            } else if (param1 == 8221) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (8211 == param1) {
              var2 = -106;
            } else if (param1 == 8212) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (339 == param1) {
              var2 = -100;
            } else if (param1 == 382) {
              var2 = -98;
            } else if (param1 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param1;
          }
        }
        if (param0 < -76) {
          return (byte) var2;
        }
        return (byte) 6;
    }

    final static void g(int param0) {
        if (param0 > -95) {
          field_Cb = (bi) null;
        }
        if (wg.field_f != null) {
          wg.field_f.b(111);
          wg.field_f = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        qr dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -4783) {
          this.field_zb = -80;
        }
        for (var4 = 0; var4 < this.field_Db.length; var4++) {
          var5 = this.field_K * var4 / this.field_Db.length;
          var6 = (1 + var4) * this.field_K / this.field_Db.length;
          this.field_Db[var4].field_hb = var5;
          this.field_Db[var4].field_db = 0;
          this.field_Db[var4].field_K = var6 - var5;
          this.field_Db[var4].field_mb = param1;
        }
        this.field_yb.a(this.field_K, this.field_mb - param1, (byte) 56, param1, 0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_xb.length) {
          this.field_xb[var8].a(-(param2 * 2) + this.field_yb.field_K, this.field_yb.field_mb - param2 * 2, (byte) 100, param2, param2);
          if (this.field_zb != var8) {
            dupTemp$0 = this.field_xb[var8];
            dupTemp$0.field_hb = dupTemp$0.field_hb + 10000;
          }
          var8++;
        }
    }

    static {
    }
}
