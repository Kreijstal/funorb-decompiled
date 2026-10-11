/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends um {
    private boolean field_s;
    static String[] field_r;
    private String field_q;
    static int field_t;

    public static void g(int param0) {
        if (param0 >= -23) {
          tm.g(-116);
        }
        field_r = null;
    }

    final void d(byte param0) {
        this.field_q = null;
        if (param0 > -92) {
          this.field_s = true;
        }
    }

    final jk a(int param0, String param1) {
        sj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        jk stackIn_3_0 = null;
        jk stackIn_12_0 = null;
        jk stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!fl.a((byte) 123, var4)) {
            stackIn_3_0 = db.field_h;
            return stackIn_3_0;
          }
          if (param0 != 0) {
            this.d((byte) -30);
          }
          if (!param1.equals(this.field_q)) {
            var3 = hi.a(param1, (byte) -80);
            if (var3 != null &&
              null == var3.field_i) {
              this.field_q = param1;
              this.field_s = var3.field_f;
            } else {
              stackIn_12_0 = ug.field_cb;
              return stackIn_12_0;
            }
          }
          if (this.field_s) {
            stackIn_17_0 = pf.field_a;
          } else {
            stackIn_17_0 = db.field_h;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static gd a(long param0, int param1) {
        if (param1 != -26778) {
          field_t = -16;
        }
        return (gd) (db.field_a.a(param0, 1));
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        sj var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26202) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = tl.a(35, var5);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param0.equals(this.field_q)) {
            var4 = hi.a(param0, (byte) -80);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_i) {
              return null;
            }
            this.field_s = var4.field_f;
            this.field_q = param0;
          }
          if (this.field_s) {
            stackIn_18_0 = a.field_e;
            return stackIn_18_0;
          }
          stackIn_16_0 = qc.field_fb;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, hl param2, int param3, int param4, hl param5, byte[] param6, hl param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          nn.field_Y = param6;
          kn.field_a = param4;
          oj.field_c = -1L;
          hg.field_k = param6.length;
          kl.field_a = false;
          km.field_o = new byte[(kn.field_a + 7) / 8];
          qb.field_N = null;
          qe.field_a = null;
          var10_int = 0;
          for (var11 = 0; var11 < nn.field_Y.length; var11++) {
            var10_int = var10_int + (255 & nn.field_Y[var11]);
          }
          var10_int = (7 + var10_int) / 8;
          lo.field_a = new byte[var10_int];
          if (param5.field_fb == null) {
            param5.field_fb = new je();
          }
          if (param0 != -58) {
            tm.g(71);
          }
          gl.field_p = param5.field_fb;
          gl.field_p.b(1);
          db.field_a = new kd(param9);
          aa.field_Pb = -1;
          nd.field_Nb = 0;
          ja.field_g = 0;
          mc.field_l = -1;
          if (null == param7.field_fb) {
            param7.field_fb = new je();
          }
          jl.field_a = param7.field_fb;
          jl.field_a.b(1);
          db.field_e = new kd(param1);
          if (null == param2.field_fb) {
            param2.field_fb = new je();
          }
          ui.field_d = param2.field_fb;
          ui.field_d.b(1);
          dg.field_g = new kd(param3);
          un.field_f = 0L;
          u.field_a = param8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("tm.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param6 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param7 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    tm(nn param0) {
        super(param0);
        this.field_s = false;
    }

    static {
        field_r = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_t = 0;
    }
}
