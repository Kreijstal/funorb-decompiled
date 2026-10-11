/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends wk {
    static boolean field_n;
    static String field_q;
    private int field_t;
    static kc field_p;
    static String field_r;
    private ug field_o;
    static String field_s;

    final static ho a(int param0, int param1, String param2) {
        ho var3 = null;
        RuntimeException var3_ref = null;
        ho stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ho(false);
          var3.field_e = param2;
          var3.field_a = param1;
          if (param0 != 0) {
            ab.q(55);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ab.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != 108) {
            this.r(-49);
          }
          for (var5_int = 0; param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            param0[param2 + var5_int] = (byte)(this.field_j[fieldTemp$0] - this.field_o.a(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ab.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void q(int param0) {
        field_r = null;
        field_p = null;
        field_s = null;
        if (param0 != 21657) {
          field_s = (String) null;
          field_q = null;
          return;
        }
        field_q = null;
    }

    final void b(int param0, int[] param1) {
        try {
          int var3_int = -46 / ((param0 + 16) / 57);
          this.field_o = new ug(param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ab.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void r(int param0) {
        if (param0 != 0) {
          return;
        }
        this.field_g = (this.field_t + 7) / 8;
    }

    ab(int param0) {
        super(param0);
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(param1 + this.field_o.a(false));
        if (param0 > -11) {
          this.field_t = -103;
        }
    }

    final int g(byte param0) {
        int var2 = 124 / ((param0 + 69) / 45);
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return 255 & this.field_j[fieldTemp$0] - this.field_o.a(false);
    }

    final int d(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = this.field_t >> 3;
        int var4 = -(7 & this.field_t) + 8;
        this.field_t = this.field_t + param1;
        int var5 = 0;
        while (var4 < param1) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_j[incrementValue$0] & rg.field_d[var4]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (var4 == param1) {
          var5 = var5 + (rg.field_d[var4] & this.field_j[var3]);
        } else {
          var5 = var5 + (this.field_j[var3] >> -param1 + var4 & rg.field_d[param1]);
        }
        if (param0 == 28089) {
          return var5;
        }
        String var7 = (String) null;
        ab.a(6, -10, (String) null);
        return var5;
    }

    final void p(int param0) {
        this.field_t = 8 * this.field_g;
        if (param0 < 26) {
          this.d(5, 58);
        }
    }

    ab(byte[] param0) {
        super(param0);
    }

    static {
        field_q = "Previous";
        field_r = "Tips";
        field_s = "Firstly, you must learn how to look around the battlefield. Practise using the 'Arrow keys' to scroll around.";
    }
}
