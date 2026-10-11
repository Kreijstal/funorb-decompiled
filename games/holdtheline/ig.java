/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends dk {
    static jd field_q;
    private nj[] field_s;
    static int field_v;
    static float[] field_u;
    private nj field_r;
    static kg field_t;

    final void a(hj[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (this.field_s[var4_int] == null) {
            this.field_s[var4_int] = new nj();
          }
          this.field_s[param2].field_j = param0;
          if (param1 != 6821) {
            this.field_r = (nj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ig.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        n stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        nj var7 = null;
        nj var9 = null;
        rm var10 = null;
        nj var11 = null;
        nj var12 = null;
        nj var13 = null;
        nj var14 = null;
        try {
          if (!(param3 instanceof rm)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (n) (param3);
          }
          var10 = (rm) (stackIn_3_0);
          td.a(param3.field_x + (param3.field_k + param1), param1 + param3.field_k, param3.field_u + param3.field_o + param4, true, param3.field_o + param4);
          if (var10 != null) {
            param0 = param0 & var10.field_D;
          }
          var7 = this.field_s[0];
          this.field_r.a((byte) -121);
          var7.a(this, this.field_r, param4, param1, -28063, param3);
          if (var10 != null) {
            if (var10.field_B) {
              var11 = this.field_s[1];
              if (var11 != null) {
                var11.a(this, this.field_r, param4, param1, -28063, param3);
              }
            }
            if (var10.field_p) {
              var12 = this.field_s[3];
              if (var10.field_v != 0 &&
                var12 != null) {
                var12.a(this, this.field_r, param4, param1, -28063, param3);
              } else {
                var9 = this.field_s[2];
                if (var9 != null) {
                  var9.a(this, this.field_r, param4, param1, -28063, param3);
                }
              }
            }
          }
          if (param3.c((byte) -20)) {
            var13 = this.field_s[5];
            if (var13 != null) {
              var13.a(this, this.field_r, param4, param1, -28063, param3);
            }
          }
          if (!param0) {
            var14 = this.field_s[4];
            if (var14 != null) {
              var14.a(this, this.field_r, param4, param1, -28063, param3);
            }
          }
          this.field_r.a(param3, param4, param1, -1, this);
          if (param2 > -48) {
            field_u = (float[]) null;
          }
          dm.b((byte) -10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("ig.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 29 / ((param0 - 7) / 56);
        field_t = null;
        field_u = null;
        field_q = null;
    }

    ig(ig param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, 119);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nj a(int param0, int param1) {
        int var3 = 98 % ((-14 - param1) / 45);
        nj dupTemp$0 = new nj();
        this.field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, hj[] param1) {
        nj[] var7 = null;
        int var4 = 0;
        nj var5 = null;
        int var6 = HoldTheLine.field_D;
        try {
          var7 = this.field_s;
          nj[] var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
            }
          }
          if (param0 != -2) {
            field_u = (float[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ig.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(ig param0, boolean param1, int param2) {
        nj dupTemp$0 = null;
        nj stackIn_8_0 = null;
        nj stackIn_9_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        nj var5 = null;
        nj var6 = null;
        int var7 = 0;
        nj var6Lifetime1;
        nj var6Lifetime2;
        int var4_intLifetime1;
        var7 = HoldTheLine.field_D;
        try {
          super.a((byte) -119, param0);
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_s[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param0.field_s[var4_int];
                stackIn_8_0 = var5;
                if (var6Lifetime2 != null) {
                  stackIn_9_1 = var6Lifetime2;
                } else {
                  dupTemp$0 = new nj();
                  param0.field_s[var4_int] = dupTemp$0;
                  stackIn_9_1 = dupTemp$0;
                }
                ((nj) (Object) stackIn_8_0).a(stackIn_9_1, -1);
              } else {
                param0.field_s[var4_int] = null;
              }
            }
          } else {
            bc.a(this.field_s, 0, param0.field_s, 0, 6);
          }
          var4_intLifetime1 = 62 % ((param2 - 28) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ig.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(hj param0, int param1) {
        int var4 = 0;
        nj[] var3 = null;
        nj var5 = null;
        int var6 = 0;
        nj[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = HoldTheLine.field_D;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ig.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public ig() {
        this.field_s = new nj[6];
        this.field_r = new nj();
        nj dupTemp$0 = new nj();
        this.field_s[0] = dupTemp$0;
        nj var1 = dupTemp$0;
        var1.a((byte) -121);
    }

    static {
        field_u = new float[]{0.800000011920929f, 0.8500000238418579f, 0.8999999761581421f, 0.949999988079071f, 1.0f};
    }
}
