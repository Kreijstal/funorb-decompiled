/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private gg field_c;
    private int field_d;
    private gg field_a;
    private int field_e;
    private gg[] field_b;

    final static void a(int param0, int param1, int param2, int param3) {
        lg.field_b = param3;
        if (param0 != 11130) {
          fd var5 = (fd) null;
          uh.a((fd) null, -29, (fd) null);
        }
        ul.field_G = param1;
        kl.field_k = param2;
    }

    final gg a(long param0, int param1) {
        gg var6 = null;
        int var7 = stellarshard.field_B;
        int var4 = 33 % ((-51 - param1) / 53);
        gg var5 = this.field_b[(int)(param0 & (long)(this.field_d - 1))];
        this.field_c = var5.field_g;
        while (this.field_c != var5) {
          if (~this.field_c.field_j == ~param0) {
            var6 = this.field_c;
            this.field_c = this.field_c.field_g;
            return var6;
          }
          this.field_c = this.field_c.field_g;
        }
        this.field_c = null;
        return null;
    }

    final static boolean a(fd param0, int param1, fd param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fd var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          var3_int = param2.field_ob - param0.field_ob;
          if (param2.field_pb != uf.field_f) {
            if (param2.field_pb == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1 != 200) {
            var5 = (fd) null;
            uh.a((fd) null, 15, (fd) null);
          }
          if (uf.field_f != param0.field_pb) {
            if (param0.field_pb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("uh.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final gg b(byte param0) {
        int fieldTemp$0 = 0;
        gg var2;
        int var3;
        var3 = stellarshard.field_B;
        if (this.field_e > 0 &&
          this.field_a != this.field_b[-1 + this.field_e]) {
          var2 = this.field_a;
          this.field_a = var2.field_g;
          return var2;
        }
        do {
          if (this.field_d <= this.field_e) {
            if (param0 >= 38) {
              return null;
            }
            this.field_d = -87;
            return null;
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          var2 = this.field_b[fieldTemp$0].field_g;
        } while (this.field_b[this.field_e - 1] == var2);
        this.field_a = var2.field_g;
        return var2;
    }

    final static wh[] a(ha param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wh[] var4 = null;
        wh var6_ref_wh = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        wh[] stackIn_6_0 = null;
        wh[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = stellarshard.field_B;
        try {
          var2_int = param0.e(8, 8);
          if (0 < var2_int) {
            stackIn_3_0 = null;
            return (wh[]) (stackIn_3_0);
          }
          if (param1 != -1) {
            stackIn_6_0 = (wh[]) null;
            return stackIn_6_0;
          }
          var3 = param0.e(12, 8);
          var4 = new wh[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (!mh.a(param0, (byte) -77)) {
              var6 = param0.e(eh.a(var5 - 1, (byte) -109), param1 ^ -9);
              var4[var5] = var4[var6];
            } else {
              var6_ref_wh = new wh();
              param0.e(24, 8);
              param0.e(24, param1 + 9);
              var6_ref_wh.field_b = param0.e(24, 8);
              param0.e(9, 8);
              param0.e(12, 8);
              param0.e(12, 8);
              param0.e(12, 8);
              var4[var5] = var6_ref_wh;
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("uh.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final gg a(byte param0) {
        int var2 = -68 % ((param0 - 32) / 59);
        this.field_e = 0;
        return this.b((byte) 63);
    }

    final void a(gg param0, long param1, int param2) {
        gg var5 = null;
        try {
          if (param0.field_c != null) {
            param0.c(20);
          }
          var5 = this.field_b[(int)((long)(this.field_d - param2) & param1)];
          param0.field_g = var5;
          param0.field_c = var5.field_c;
          param0.field_c.field_g = param0;
          param0.field_g.field_c = param0;
          param0.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "uh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    uh(int param0) {
        int var2 = 0;
        gg dupTemp$0 = null;
        gg var3 = null;
        this.field_e = 0;
        this.field_b = new gg[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new gg();
          var3 = dupTemp$0;
          this.field_b[var2] = dupTemp$0;
          var3.field_c = var3;
          var3.field_g = var3;
        }
    }

    static {
    }
}
