/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ed {
    private int field_z;
    private wa field_v;
    private int field_y;
    static int[] field_w;
    static String field_x;

    mi(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        param2 = param2 & e.field_b[param1];
        while (param1 > this.field_y) {
          param1 = param1 - this.field_y;
          fieldTemp$1 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_p[fieldTemp$1] = (byte)(this.field_p[fieldTemp$1] + (param2 >>> param1));
          this.field_p[this.field_u] = (byte) 0;
          this.field_y = 8;
        }
        var4 = -41 / ((62 - param0) / 36);
        if (this.field_y != param1) {
          this.field_y = this.field_y - param1;
          this.field_p[this.field_u] = (byte)(this.field_p[this.field_u] + (param2 << this.field_y));
          return;
        }
        fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_p[fieldTemp$0] = (byte)(this.field_p[fieldTemp$0] + param2);
        this.field_p[this.field_u] = (byte) 0;
        this.field_y = 8;
        return;
    }

    final void d(boolean param0) {
        this.field_p[this.field_u] = (byte) 0;
        this.field_y = 8;
        if (param0) {
          mi.r(42);
        }
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_p[fieldTemp$0] = (byte)(this.field_v.a((byte) 72) + param0);
        if (param1 <= 117) {
          this.c((byte) -52, 85);
        }
    }

    final int c(byte param0) {
        int var2 = -43 / ((param0 + 50) / 46);
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        return 255 & this.field_p[fieldTemp$0] - this.field_v.a((byte) 72);
    }

    final static er[] a(String param0, r param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        er[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a((byte) 126, param3);
          if (param2 != 34) {
            mi.r(66);
          }
          var5 = param1.a(var4_int, param0, 94);
          stackIn_3_0 = bk.a(var4_int, var5, param1, -2724);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mi.VA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void p(int param0) {
        if (param0 != 0) {
          this.d(false);
          this.field_z = this.field_u * 8;
          return;
        }
        this.field_z = this.field_u * 8;
    }

    final int c(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 >= -92) {
          field_w = (int[]) null;
        } else {
          var3 = this.field_z >> 3;
          var4 = 8 - (7 & this.field_z);
          this.field_z = this.field_z + param1;
          var5 = 0;
          while (param1 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((e.field_b[var4] & this.field_p[incrementValue$0]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
          }
          if (var4 != param1) {
            var5 = var5 + (this.field_p[var3] >> var4 - param1 & e.field_b[param1]);
          } else {
            var5 = var5 + (this.field_p[var3] & e.field_b[var4]);
          }
          return var5;
        }
        var3Lifetime1 = this.field_z >> 3;
        var4Lifetime1 = 8 - (7 & this.field_z);
        this.field_z = this.field_z + param1;
        var5Lifetime1 = 0;
        while (param1 > var4Lifetime1) {
          incrementValue$1 = var3Lifetime1;
          var3Lifetime1++;
          var5Lifetime1 = var5Lifetime1 + ((e.field_b[var4Lifetime1] & this.field_p[incrementValue$1]) << param1 - var4Lifetime1);
          param1 = param1 - var4Lifetime1;
          var4Lifetime1 = 8;
        }
        if (var4Lifetime1 != param1) {
          var5Lifetime1 = var5Lifetime1 + (this.field_p[var3Lifetime1] >> var4Lifetime1 - param1 & e.field_b[param1]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (this.field_p[var3Lifetime1] & e.field_b[var4Lifetime1]);
        }
        return var5Lifetime1;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 < 24) {
            field_x = (String) null;
          }
          for (var5_int = 0; var5_int < param1; var5_int++) {
            fieldTemp$0 = this.field_u;
            this.field_u = this.field_u + 1;
            param2[param3 + var5_int] = (byte)(this.field_p[fieldTemp$0] - this.field_v.a((byte) 72));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mi.WA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int[] param0, int param1) {
        try {
          if (param1 < 33) {
            this.j(40, -119);
          }
          this.field_v = new wa(param0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mi.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void q(int param0) {
        if (~this.field_y > param0) {
          this.field_y = 8;
          this.field_u = this.field_u + 1;
        }
    }

    final void b(byte param0) {
        this.field_u = (this.field_z + 7) / 8;
        if (param0 > -49) {
          this.field_v = (wa) null;
        }
    }

    public static void r(int param0) {
        field_w = null;
        field_x = null;
        if (param0 <= 79) {
          mi.r(84);
        }
    }

    mi(int param0) {
        super(param0);
    }

    final static void k(int param0, int param1) {
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -32460) {
          mi.r(53);
        }
        m.field_B = param1;
        var2 = param1;
        if (var2 == 0) {
          pn.field_L = 1;
          be.field_q = false;
          pl.field_n = 1;
          oo.field_i = true;
          hn.field_t = false;
          cn.field_r = false;
          lf.field_C = false;
          return;
        }
        if (var2 == 1) {
          pl.field_n = 0;
          be.field_q = false;
          oo.field_i = true;
          lf.field_C = true;
          pn.field_L = 1;
          hn.field_t = true;
          cn.field_r = true;
          return;
        }
        if (var2 != 2) {
          return;
        }
        cn.field_r = true;
        hn.field_t = true;
        pl.field_n = 0;
        be.field_q = true;
        lf.field_C = true;
        pn.field_L = 0;
        oo.field_i = false;
    }

    static {
        field_x = "Add <%0> to ignore list";
    }
}
