/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends di {
    static String field_p;
    private String field_o;
    static String field_n;
    private boolean field_m;
    static String[] field_r;
    static String field_q;

    ia(ej param0) {
        super(param0);
        this.field_m = false;
    }

    final im b(String param0, int param1) {
        pd var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        im stackIn_5_0 = null;
        im stackIn_12_0 = null;
        im stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_n = (String) null;
          }
          var4 = (CharSequence) ((Object) param0);
          if (!be.a(var4, 112)) {
            stackIn_5_0 = qf.field_d;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_o)) {
            var3 = ta.a(true, param0);
            if (var3 != null &&
              var3.field_b == null) {
              this.field_o = param0;
              this.field_m = var3.field_i;
            } else {
              stackIn_12_0 = oh.field_b;
              return stackIn_12_0;
            }
          }
          if (!this.field_m) {
            stackIn_17_0 = qf.field_d;
          } else {
            stackIn_17_0 = dg.field_c;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ia.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        pd var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -100 % ((26 - param1) / 56);
          var6 = (CharSequence) ((Object) param0);
          var4 = hf.a(var6, (byte) -97);
          if (var4 != null) {
            stackIn_2_0 = var4;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_o)) {
            var5 = ta.a(true, param0);
            if (var5 == null) {
              return null;
            }
            if (var5.field_b != null) {
              return null;
            }
            this.field_o = param0;
            this.field_m = var5.field_i;
          }
          if (this.field_m) {
            stackIn_15_0 = lk.field_e;
            return stackIn_15_0;
          }
          stackIn_13_0 = mg.field_m;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ia.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Canvas param1, int param2, byte param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        byte[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param1.getGraphics();
            k.field_f.a(param2, param0, var4, 101);
            if (param3 <= 103) {
              var5 = (byte[]) null;
              ia.a(95, (dh) null, (byte) 67, (java.math.BigInteger) null, (java.math.BigInteger) null, 39, (byte[]) null);
            }
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param1.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("ia.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (jl.field_I != null) {
          jl.field_I.h((byte) -28);
          if (vi.field_n == null) {
            if (param0 >= 29) {
              wb.b(107);
              return;
            }
            field_r = (String[]) null;
            wb.b(107);
            return;
          }
          vi.field_n.h((byte) -81);
          if (param0 < 29) {
            field_r = (String[]) null;
            wb.b(107);
            return;
          }
          wb.b(107);
          return;
        }
        if (vi.field_n != null) {
          vi.field_n.h((byte) -81);
          if (param0 >= 29) {
            wb.b(107);
            return;
          }
          field_r = (String[]) null;
          wb.b(107);
          return;
        }
        if (param0 >= 29) {
          wb.b(107);
          return;
        }
        field_r = (String[]) null;
        wb.b(107);
    }

    final void g(int param0) {
        this.field_o = null;
        if (param0 != -4328) {
          String var3 = (String) null;
          this.a((String) null, 24);
        }
    }

    final static void a(int param0, dh param1, byte param2, java.math.BigInteger param3, java.math.BigInteger param4, int param5, byte[] param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        var10 = Terraphoenix.field_V;
        try {
          var7_int = ic.a((byte) 122, param5);
          if (vk.field_b == null) {
            vk.field_b = new java.security.SecureRandom();
          }
          var12 = new int[4];
          var11 = var12;
          var8 = var11;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = vk.field_b.nextInt();
          }
          if (ie.field_b == null ||
            !(ie.field_b.field_i.length >= var7_int)) {
            ie.field_b = new dh(var7_int);
          }
          ie.field_b.field_k = 0;
          ie.field_b.a(-222449912, param6, param5, param0);
          ie.field_b.f(var7_int, -2108648176);
          ie.field_b.a(-6716, var12);
          if (null == jc.field_z ||
            !(100 <= jc.field_z.field_i.length)) {
            jc.field_z = new dh(100);
          }
          jc.field_z.field_k = 0;
          jc.field_z.i(10, 92);
          for (var9Lifetime1 = 0; var9Lifetime1 < 4; var9Lifetime1++) {
            jc.field_z.e(var12[var9Lifetime1], 8959);
          }
          jc.field_z.h(-1564407352, param5);
          jc.field_z.a(param4, (byte) -52, param3);
          param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
          var9Lifetime2 = 39 % ((param2 - 0) / 61);
          param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("ia.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static pd a(int param0, boolean param1) {
        pd var2 = null;
        pd var2Lifetime1;
        if (param0 == 4) {
          var2 = new pd(true);
          var2.field_a = param1 ? true : false;
          return var2;
        }
        field_r = (String[]) null;
        var2Lifetime1 = new pd(true);
        var2Lifetime1.field_a = param1 ? true : false;
        return var2Lifetime1;
    }

    final static void a(int param0, cc param1, int param2) {
        int var4 = 0;
        uc var5 = di.field_l;
        uc var3 = var5;
        var5.k(-17410, param0);
        var5.field_k = var5.field_k + 1;
        if (param2 > -51) {
          return;
        }
        try {
          var4 = var5.field_k;
          var5.i(1, -114);
          if (param1.field_h != null) {
            var5.i(param1.field_h.length, -108);
            var5.a(-222449912, param1.field_h, param1.field_h.length, 0);
          } else {
            var5.i(0, -119);
          }
          var5.d(var4, 8600);
          var5.field_k = var5.field_k - 4;
          param1.field_k = var5.f((byte) -107);
          var5.j(var5.field_k - var4, -119);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ia.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(byte param0) {
        field_q = null;
        field_p = null;
        if (param0 == -48) {
          field_n = null;
          field_r = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        ia.a(-110, (dh) null, (byte) 46, (java.math.BigInteger) null, (java.math.BigInteger) null, -122, (byte[]) null);
        field_n = null;
        field_r = null;
    }

    static {
        field_p = "(Including <%0>)";
        field_q = "Unpacking sound effects";
        field_n = "Exit Research Screen";
    }
}
