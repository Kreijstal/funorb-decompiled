/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_g;
    private bh[] field_h;
    private int field_d;
    static String field_e;
    private int field_f;
    static String field_j;
    static long field_a;
    static w field_i;
    static ck field_b;
    static String field_l;
    private bh field_k;
    private bh field_c;

    final static void a(ck[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = client.field_A ? 1 : 0;
        try {
          if (param0 != null &&
            param1 > 0) {
            var5_int = param0[0].field_K;
            var6 = param0[2].field_K;
            if (param3 != -1) {
              field_g = (String) null;
            }
            var7 = param0[1].field_K;
            param0[0].c(param4, param2);
            param0[2].c(param4 + param1 - var6, param2);
            hk.b(kh.field_e);
            hk.f(var5_int + param4, param2, param4 + (param1 - var6), param2 + param0[1].field_C);
            var8 = var5_int + param4;
            var9 = -var6 + param4 + param1;
            for (param4 = var8; param4 < var9; param4 = param4 + var7) {
              param0[1].c(param4, param2);
            }
            hk.a(kh.field_e);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ng.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -26) {
          return;
        }
        field_j = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final void a(long param0, int param1, bh param2) {
        bh var5 = null;
        try {
          if (null != param2.field_a) {
            param2.b((byte) 116);
          }
          var5 = this.field_h[(int)((long)(this.field_f + param1) & param0)];
          param2.field_a = var5.field_a;
          param2.field_b = var5;
          param2.field_a.field_b = param2;
          param2.field_b.field_a = param2;
          param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bh a(long param0, int param1) {
        bh var5 = null;
        int var6 = client.field_A ? 1 : 0;
        bh var4 = this.field_h[(int)((long)(this.field_f - 1) & param0)];
        this.field_k = var4.field_b;
        while (this.field_k != var4) {
          if (~this.field_k.field_i == ~param0) {
            var5 = this.field_k;
            this.field_k = this.field_k.field_b;
            return var5;
          }
          this.field_k = this.field_k.field_b;
        }
        this.field_k = null;
        if (param1 < 48) {
          return (bh) null;
        }
        return null;
    }

    final static jc a(int param0, String param1) {
        jc stackIn_3_0 = null;
        jc stackIn_6_0 = null;
        jc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        jc stackIn_26_0 = null;
        jc stackIn_40_0 = null;
        jc stackIn_44_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = client.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = hm.field_a;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_6_0 = ga.field_e;
            return stackIn_6_0;
          }
          if (param0 != -1) {
            var7 = (ck[]) null;
            ng.a((ck[]) null, 38, -12, 7, -118);
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_13_0 = be.field_x;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = be.field_x;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = be.field_x;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == nm.field_Pb.indexOf(var5Lifetime1)) {
                stackIn_44_0 = be.field_x;
                return stackIn_44_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("ng.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final bh a(byte param0) {
        this.field_d = 0;
        if (param0 != 126) {
          this.b((byte) 112);
          return this.b((byte) 49);
        }
        return this.b((byte) 49);
    }

    final bh b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        bh var4;
        bh var5;
        bh var8;
        bh var9;
        var3 = client.field_A ? 1 : 0;
        if (this.field_d <= 0) {
          if (param0 < 37) {
            return (bh) null;
          }
          do {
            if (this.field_f <= this.field_d) {
              return null;
            }
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_h[fieldTemp$0].field_b;
            var9 = var4;
          } while (var4 == this.field_h[-1 + this.field_d]);
          this.field_c = var9.field_b;
          return var9;
        }
        if (this.field_h[-1 + this.field_d] != this.field_c) {
          var8 = this.field_c;
          this.field_c = var8.field_b;
          return var8;
        }
        if (param0 < 37) {
          return (bh) null;
        }
        do {
          if (this.field_f <= this.field_d) {
            return null;
          }
          fieldTemp$1 = this.field_d;
          this.field_d = this.field_d + 1;
          var4 = this.field_h[fieldTemp$1].field_b;
          var5 = var4;
        } while (var4 == this.field_h[-1 + this.field_d]);
        this.field_c = var5.field_b;
        return var5;
    }

    ng(int param0) {
        int var2 = 0;
        bh dupTemp$1 = null;
        bh var3;
        this.field_d = 0;
        this.field_f = param0;
        this.field_h = new bh[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new bh();
          var3 = dupTemp$1;
          this.field_h[var2] = dupTemp$1;
          var3.field_b = var3;
          var3.field_a = var3;
        }
    }

    static {
        field_e = "Please check if address is correct";
        field_g = "Stage";
        field_j = "This password is part of your Player Name, and would be easy to guess";
        field_l = "Waiting for graphics";
    }
}
