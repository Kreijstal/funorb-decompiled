/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends rd {
    static int field_n;
    private int field_l;
    static int[] field_j;
    static jg[] field_o;
    private int field_m;
    static ko field_p;
    static bf field_r;
    static String field_q;
    static vc field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        String var7 = null;
        mi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var7 = (String) null;
            rn.a(-72, true, 42L, (String) null, (String) null);
          }
          this.field_l = this.field_l + param3;
          this.field_m = this.field_m + 1;
          stackIn_3_0 = new mi(bm.field_g, true);
          return (f) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("rn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String[] a(String param0, byte param1) {
        int var2_int = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          var2_int = an.field_q.a(param0, 148);
          var3 = new String[var2_int];
          an.field_q.a(param0, new int[]{148}, var3);
          var4 = 0;
          while (true) {
            if (var4 >= var3.length) {
              var4 = -61 / ((param1 - 30) / 40);
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            while (true) {
              var5 = var3[var4].indexOf("<br>");
              if (var5 >= 0) {
                var3[var4] = var3[var4].substring(0, var5) + var3[var4].substring(4 + var5);
                continue;
              }
              break;
            }
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("rn.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        tb.field_d.a(ad.field_k, 100, 48 * gi.field_m * this.field_m, this.field_l / this.field_m);
        this.field_m = 0;
        int var2 = -42 / ((29 - param0) / 42);
        this.field_l = 0;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
          ta var3 = (ta) null;
          this.a(true, 103, 109, -114, (ta) null);
        }
        return (pb) ((Object) new cl());
    }

    final static mg a(int param0, boolean param1, long param2, String param3, String param4) {
        RuntimeException var6 = null;
        uh stackIn_5_0 = null;
        bq stackIn_7_0 = null;
        fa stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0L &&
            param4 != null) {
            stackIn_7_0 = new bq(param4, param3);
            return (mg) ((Object) stackIn_7_0);
          }
          if (param1) {
            stackIn_5_0 = new uh(param2, param3);
            return (mg) ((Object) stackIn_5_0);
          }
          if (param0 != 0) {
            field_o = (jg[]) null;
          }
          stackIn_11_0 = new fa(param2, param3);
          return (mg) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("rn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_r = null;
        field_j = null;
        field_o = null;
        field_p = null;
        if (param0 >= -72) {
          rn.d(-52);
        }
        field_q = null;
        field_k = null;
    }

    rn() {
        this.field_l = 0;
        this.field_m = 0;
    }

    final static String d(int param0) {
        if (param0 < ~eq.field_j) {
          return hd.field_b;
        }
        if (null != be.field_e) {
          if (!be.field_e.a((byte) 102)) {
            return jg.field_h;
          }
          return ge.field_a;
        }
        if (!rb.field_k.a((byte) 102)) {
          return re.field_n;
        }
        if (!rb.field_k.a(-20402, "commonui")) {
          return dp.field_j + " - " + rb.field_k.b("commonui", -38) + "%";
        }
        if (!ok.field_c.a((byte) 102)) {
          return ld.field_w;
        }
        if (!ok.field_c.a(param0 ^ 20403, "commonui")) {
          return jn.field_k + " - " + ok.field_c.b("commonui", -60) + "%";
        }
        if (!dd.field_a.a((byte) 102)) {
          return gf.field_d;
        }
        if (!dd.field_a.a(false)) {
          return l.field_a + " - " + dd.field_a.b(3492) + "%";
        }
        return wp.field_a;
    }

    static {
        int var0 = 0;
        field_j = new int[16];
        for (var0 = 0; 16 > var0; var0++) {
          field_j[var0] = 198149 * var0;
        }
        field_q = null;
        field_r = new bf();
    }
}
