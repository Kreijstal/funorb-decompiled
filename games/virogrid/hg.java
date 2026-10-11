/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends jc {
    static String field_n;
    private int field_r;
    private mm field_s;
    static String field_o;
    static char[] field_q;
    static km field_p;

    final void g(int param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 + this.field_s.a(5180));
        if (param1 != 8) {
          field_o = (String) null;
          return;
        }
    }

    hg(byte[] param0) {
        super(param0);
    }

    final void j(int param0) {
        this.field_r = param0 * this.field_l;
    }

    final void k(int param0) {
        this.field_l = (param0 + this.field_r) / 8;
    }

    final void a(int[] param0, boolean param1) {
        try {
          this.field_s = new mm(param0);
          if (param1) {
            this.c((byte) -30, 7);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "hg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hg(int param0) {
        super(param0);
    }

    final int c(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var3 = this.field_r >> 3;
        int var4 = -(this.field_r & 7) + 8;
        this.field_r = this.field_r + param1;
        int var5 = 0;
        if (param0 != -78) {
          this.field_r = 29;
          while (param1 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((lh.field_b[var4] & this.field_g[incrementValue$0]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
          }
          if (param1 != var4) {
            var5 = var5 + (this.field_g[var3] >> var4 - param1 & lh.field_b[param1]);
          } else {
            var5 = var5 + (this.field_g[var3] & lh.field_b[var4]);
          }
          return var5;
        }
        while (param1 > var4) {
          incrementValue$1 = var3;
          var3++;
          var5 = var5 + ((lh.field_b[var4] & this.field_g[incrementValue$1]) << -var4 + param1);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 != var4) {
          var5 = var5 + (this.field_g[var3] >> var4 - param1 & lh.field_b[param1]);
        } else {
          var5 = var5 + (this.field_g[var3] & lh.field_b[var4]);
        }
        return var5;
    }

    public static void f(byte param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 != 103) {
          return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          for (var5_int = 0; param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            param2[var5_int + param1] = (byte)(this.field_g[fieldTemp$0] - this.field_s.a(5180));
          }
          if (param0 > -103) {
            this.c((byte) 114, 127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final int e(boolean param0) {
        int fieldTemp$0 = 0;
        if (!param0) {
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          return this.field_g[fieldTemp$0] - this.field_s.a(5180) & 255;
        }
        return -55;
    }

    static {
        field_n = "Play again";
        field_q = new char[128];
        field_o = "This game has started.";
    }
}
