/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ni {
    private int field_o;
    private pc field_n;
    static sf field_l;
    static String field_m;

    final void k(int param0) {
        this.field_o = param0 * this.field_i;
    }

    final void m(int param0) {
        this.field_i = (this.field_o + 7) / param0;
    }

    ih(byte[] param0) {
        super(param0);
    }

    final int f(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == 47) {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_k[fieldTemp$0] - this.field_n.a(995108848) & 255;
        }
        this.m(-38);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_k[fieldTemp$1] - this.field_n.a(995108848) & 255;
    }

    public static void j(int param0) {
        field_m = null;
        if (param0 != 8) {
          return;
        }
        field_l = null;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$0] = (byte)(this.field_n.a(995108848) + param1);
        if (param0 != 8) {
          this.field_n = (pc) null;
        }
    }

    final int b(int param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        int var3 = this.field_o >> 3;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1 != -87) {
          ih.j(33);
        } else {
          var4 = 8 - (this.field_o & 7);
          var5 = 0;
          this.field_o = this.field_o + param0;
          while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((ek.field_d[var4] & this.field_k[incrementValue$0]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
          }
          if (var4 != param0) {
            var5 = var5 + (this.field_k[var3] >> var4 - param0 & ek.field_d[param0]);
          } else {
            var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
          }
          return var5;
        }
        var4Lifetime1 = 8 - (this.field_o & 7);
        var5Lifetime1 = 0;
        this.field_o = this.field_o + param0;
        while (var4Lifetime1 < param0) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((ek.field_d[var4Lifetime1] & this.field_k[incrementValue$1]) << param0 - var4Lifetime1);
          param0 = param0 - var4Lifetime1;
          var4Lifetime1 = 8;
        }
        if (var4Lifetime1 != param0) {
          var5Lifetime1 = var5Lifetime1 + (this.field_k[var3] >> var4Lifetime1 - param0 & ek.field_d[param0]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (ek.field_d[var4Lifetime1] & this.field_k[var3]);
        }
        return var5Lifetime1;
    }

    final static void l(int param0) {
        if (param0 == 255) {
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        }
        field_l = (sf) null;
        af.a(ef.field_j, true, oa.field_o, (byte) 54);
        ud.field_c = true;
    }

    ih(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          if (param0 < 66) {
            ih.j(-43);
          }
          for (var5_int = 0; param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            param3[param2 + var5_int] = (byte)(this.field_k[fieldTemp$0] - this.field_n.a(995108848));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ih.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int[] param0, byte param1) {
        try {
          this.field_n = new pc(param0);
          if (param1 != 12) {
            this.e(-95, -126);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ih.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = "Flea Circus";
    }
}
