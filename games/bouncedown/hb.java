/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends ak {
    static String field_C;
    private tj field_E;
    private int field_A;
    static long field_H;
    private String field_J;
    private boolean field_I;
    private int field_K;
    static vi field_F;
    static volatile int field_B;
    private int field_G;

    public static void e(byte param0) {
        if (param0 < 118) {
          field_C = (String) null;
          field_C = null;
          field_F = null;
          return;
        }
        field_C = null;
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        tj stackIn_9_0;
        String stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_9_5;
        int stackIn_9_6;
        int stackIn_9_7;
        int stackIn_10_8 = 0;
        int stackIn_17_0 = 0;
        tj stackIn_19_0;
        String stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        int stackIn_19_4;
        int stackIn_19_5;
        int stackIn_19_6;
        int stackIn_19_7;
        int stackIn_20_8 = 0;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param2 > 33) {
          var5 = param3 + this.field_r;
          var6 = param1 + this.field_i;
          super.a(param0, param1, 64, param3);
          if (param0 != 0) {
            return;
          }
          if (!this.field_I) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_k + (-this.field_G - this.field_K * 2);
          }
          var7 = stackIn_17_0;
          stackIn_19_0 = this.field_E;
          stackIn_19_1 = this.field_J;
          stackIn_19_2 = var5 + (var7 + this.field_K);
          stackIn_19_3 = var6 + this.field_K;
          stackIn_19_4 = -this.field_K + this.field_G;
          stackIn_19_5 = this.field_m - this.field_K * 2;
          stackIn_19_6 = this.field_A;
          stackIn_19_7 = -1;
          stackIn_20_8 = (!this.field_I) ? 2 : 0;
          ((tj) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5, stackIn_19_6, stackIn_19_7, stackIn_20_8, 1, this.field_E.field_s);
          return;
        }
        this.field_K = 125;
        var5Lifetime1 = param3 + this.field_r;
        var6Lifetime1 = param1 + this.field_i;
        super.a(param0, param1, 64, param3);
        if (param0 != 0) {
          return;
        }
        if (!this.field_I) {
          stackIn_7_0 = 0;
        } else {
          stackIn_7_0 = this.field_k + (-this.field_G - this.field_K * 2);
        }
        var7Lifetime1 = stackIn_7_0;
        stackIn_9_0 = this.field_E;
        stackIn_9_1 = this.field_J;
        stackIn_9_2 = var5Lifetime1 + (var7Lifetime1 + this.field_K);
        stackIn_9_3 = var6Lifetime1 + this.field_K;
        stackIn_9_4 = -this.field_K + this.field_G;
        stackIn_9_5 = this.field_m - this.field_K * 2;
        stackIn_9_6 = this.field_A;
        stackIn_9_7 = -1;
        stackIn_10_8 = (!this.field_I) ? 2 : 0;
        ((tj) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_10_8, 1, this.field_E.field_s);
    }

    hb(int param0, int param1, int param2, int param3, lk param4, boolean param5, int param6, int param7, tj param8, int param9, String param10) {
        super(param0, param1, param2, param3, (fc) null, (sk) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_K = param7;
          stackIn_4_1 = (param5);
          this.field_I = stackIn_4_1;
          this.field_G = param6;
          this.field_x = param4;
          this.field_E = param8;
          this.field_A = param9;
          this.field_J = param10;
          var12_int = this.field_G - this.field_K;
          var13 = this.field_E.b(param10, var12_int, this.field_E.field_s) + 2 * this.field_K;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.b(var13, 80, param2, param0, param1);
          }
          if (!this.field_I) {
            stackIn_10_0 = this.field_K * 2 + this.field_G;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_x.b(param3 - 2 * this.field_K, 80, -this.field_G + (param2 - this.field_K * 3), var14, (var13 - param3 >> 1) + this.field_K);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("hb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ii var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ke var11 = null;
        ii var12 = null;
        ld var13 = null;
        int[] var14 = null;
        ld var15 = null;
        int[] var16 = null;
        var8 = Bounce.field_N;
        try {
          var12 = jc.field_g;
          if (param0 != 1790) {
            hb.d((byte) 109);
          }
          var2 = var12.d((byte) -92);
          if (0 == var2) {
            var10 = eh.a(param0 ^ -1674);
            var16 = var10;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((wi) ((Object) var5)).d((byte) -77);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((wi) ((Object) var5)).j(ud.a(param0, -1789));
            }
            var15 = (ld) (ne.field_r.a((byte) -86));
            if (var15 == null) {
              kc.a((byte) 18);
              return;
            }
            var15.field_g = true;
            var15.field_i = var3;
            var15.field_k = var16[0];
            var15.c(2);
            return;
          }
          if (1 == var2) {
            var11 = (ke) (uk.field_d.a((byte) -72));
            if (var11 != null) {
              var11.c(2);
              return;
            }
            kc.a((byte) 18);
            return;
          }
          if (var2 != 2) {
            ti.a((Throwable) null, (byte) 100, "A1: " + la.a(-106));
            kc.a((byte) 18);
            return;
          }
          var13 = (ld) (ne.field_r.a((byte) -118));
          if (var13 == null) {
            kc.a((byte) 18);
            return;
          }
          var13.field_i = eh.a(-117);
          var13.field_k = var13.field_i[0];
          var13.field_g = true;
          var13.c(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "hb.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(ag.a(param1, var2, false), "_top");
              var3 = -43 % ((param0 + 73) / 44);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("hb.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        ea.field_f = false;
        int var1 = -60 % ((-45 - param0) / 61);
        t.field_r = null;
        eb.field_E = null;
        vb.field_k = null;
        ll.field_E = null;
    }

    final String d(int param0) {
        int var2 = this.field_x.field_g ? 1 : 0;
        this.field_x.field_g = this.field_g;
        String var3 = this.field_x.d(param0 ^ param0);
        this.field_x.field_g = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_C = "Email address is unavailable";
        field_H = 20000000L;
        field_B = 0;
    }
}
