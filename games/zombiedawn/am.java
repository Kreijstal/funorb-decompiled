/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends de {
    private uo field_l;
    private int field_n;
    static String field_m;

    final void a(int param0, int[] param1) {
        try {
          this.field_l = new uo(param1);
          int var3_int = 35 % ((-7 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "am.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int i(byte param0) {
        if (param0 <= 122) {
          return 95;
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_h[fieldTemp$0] - this.field_l.a(92) & 255;
    }

    final void h(byte param0) {
        if (param0 != 75) {
          this.i(13);
        }
        this.field_n = this.field_j * 8;
    }

    final void i(int param0) {
        this.field_j = (7 + this.field_n) / param0;
    }

    final static void k(int param0) {
        if (ej.field_x != 0 - mj.field_b &&
          ej.field_x == -mj.field_b + 250) {
        }
        if (param0 != -21215) {
          return;
        }
        ej.field_x = ej.field_x + 1;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          var2_int = param0.length();
          if (param1 != 1) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[var2_int - (1 + var4)] = param0.charAt(var4);
          }
          stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("am.K(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          for (var5_int = param3; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            param1[var5_int + param2] = (byte)(this.field_h[fieldTemp$0] - this.field_l.a(96));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("am.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    am(int param0) {
        super(param0);
    }

    final int k(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = ZombieDawn.field_J;
        int var3 = this.field_n >> 3;
        int var4 = 8 - (7 & this.field_n);
        int var5 = 0;
        this.field_n = this.field_n + param1;
        if (param0 < 10) {
          field_m = (String) null;
        }
        while (param1 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_h[incrementValue$0] & jd.field_e[var4]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 != var4) {
          var5 = var5 + (this.field_h[var3] >> var4 - param1 & jd.field_e[param1]);
        } else {
          var5 = var5 + (jd.field_e[var4] & this.field_h[var3]);
        }
        return var5;
    }

    am(byte[] param0) {
        super(param0);
    }

    public static void j(int param0) {
        int var1 = -108 % ((-29 - param0) / 56);
        field_m = null;
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param1 + this.field_l.a(124));
        if (param0 != 11) {
          this.field_n = -62;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        String var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (11 == fl.field_a) {
            qo.c(29756);
          }
          qh.a(mm.field_k, ka.field_a, (byte) -92, ma.field_p);
          uh.a(-113, 0, 0, param0);
          if (param1 > -79) {
            var3 = (String) null;
            am.a((String) null, 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("am.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "Unpacking sound effects";
    }
}
